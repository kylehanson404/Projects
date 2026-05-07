package module1;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calc calc = new Calc();

        // safe input
        double firstNumber =
                calc.getValidNumber(input, "Enter first number: ");

        double secondNumber =
                calc.getValidNumber(input, "Enter second number: ");

        // set numbers
        calc.setNum1(firstNumber);
        calc.setNum2(secondNumber);

        // display results
        System.out.println("\n" + calc);

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());

        input.close();
    }
}