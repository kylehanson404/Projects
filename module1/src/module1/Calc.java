public class Calc {

    // private data fields
    private double num1;
    private double num2;

    // constructor
    public Calc(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }

    // getters
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // math methods
    public double sum() {
        return num1 + num2;
    }

    public double difference() {
        return num1 - num2;
    }

    public double product() {
        return num1 * num2;
    }

    public double quotient() {
        return num1 / num2;
    }

    // toString method
    public String toString() {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }
}