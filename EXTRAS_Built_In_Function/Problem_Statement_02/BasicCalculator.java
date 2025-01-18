import java.util.Scanner;

class Calculator {
    double num1, num2;

    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double addition() {
        return num1 + num2;
    }

    public double subtraction() {
        return num1 - num2;
    }

    public double multiplication() {
        return num1 * num2;
    }

    public double division() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return "Not a Number"
        }
        return num1 / num2;
    }
}

public class BasicCalculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number:");
        double num1 = input.nextDouble();

        System.out.println("Enter Second number:");
        double num2 = input.nextDouble();

        System.out.println("Enter symbol to perform operation (+, -, *, /):");
        char ch = input.next().charAt(0);

        Calculator c1 = new Calculator(num1, num2);
        double result = 0;

        switch (ch) {
            case '+':
                result = c1.addition();
                break;
            case '-':
                result = c1.subtraction();
                break;
            case '*':
                result = c1.multiplication();
                break;
            case '/':
                result = c1.division();
                break;
            default:
                System.out.println("Invalid operator.");
                input.close();
                return;
        }

        System.out.println("Result: " + result);
        input.close();
    }
}
