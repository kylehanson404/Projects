package module1;

import java.util.Scanner;

public class Tests {

    // Private data fields
    private int count;       
    private double average;  

    // Constructor
    public Tests() {
        count = 0;
        average = Double.NaN;   // allows NaN when no scores entered
    }

    // Public void method (as required)
    public void getAverage() {

        Scanner input = new Scanner(System.in);

        double sum = 0.0;
        int localCount = 0;

        System.out.println("Enter test scores (press -1 to quit): ");
        double score = input.nextDouble();   // prime the loop

        while (score != -1) {
            sum += score;
            localCount++;

            System.out.println("Enter test scores (press -1 to quit): ");
            score = input.nextDouble();
        }

        count = localCount;
        average = sum / localCount;   // produces NaN if localCount = 0
    }

    @Override
    public String toString() {
        return String.format(
            "The average of the %d scores entered is %.2f.",
            count, average
        );
    }
}