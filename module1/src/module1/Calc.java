public class Calc {

    // private data fields
    private double num1;
    private double num2;

    // default constructor
    public Calc() {
        num1 = 0;
        num2 = 0;
    }

    // setters
    public void setNum1(double n1) {
        num1 = n1;
    }

    public void setNum2(double n2) {
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
    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    // toString method
    public String toString() {
        return "Displaying private data fields using toString():\n" +
               "Num1: " + num1 + "\n" +
               "Num2: " + num2;
    }
}