import java.util.Scanner;

public class SixthProgram {
    public static void main(String[] args) {
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        // Taking another input from the user
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        // Taking the operator input from the user
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next();

        // Calculating the result based on the operator
        for (int i = 1; i < 2; i++) { 
            switch (op) {
                case "+":
                    System.out.println("Result: " + (first + second));
                    break;
                case "-":
                    System.out.println("Result: " + (first - second));
                    break;
                case "*":
                    System.out.println("Result: " + (first * second));
                    break;
                case "/":
                    if (second != 0) {
                        System.out.println("Result: " + (first / second));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator.");
                    break;
            }
        }

        // Closing the input object
        input.close();
    }
}
