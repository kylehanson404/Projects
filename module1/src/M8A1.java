import java.io.*;
import java.text.DecimalFormat;

public class M8A1 {
    public static void main(String[] args) {

        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            writer.write("Name,Pay Rate,Hours Worked,Weekly Pay");
            writer.newLine();

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                String name = data[0];
                double payRate = Double.parseDouble(data[1]);
                double hoursWorked = Double.parseDouble(data[2]);

                double weeklyPay;

                if (hoursWorked > 40) {
                    weeklyPay = (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5);
                } else {
                    weeklyPay = hoursWorked * payRate;
                }

                DecimalFormat df = new DecimalFormat("$0.00");
                String formattedPay = df.format(weeklyPay);

                String outputLine = name + "," + payRate + "," + hoursWorked + "," + formattedPay;

                writer.write(outputLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Done! Check output.csv");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}