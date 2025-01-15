import java.util.Scanner;
import java.lang.Integer;

public class FormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to an integer: ");
        String text = scanner.nextLine();

        // This will throw a NumberFormatException if the input is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to demonstrate handling NumberFormatException
    public static void handleException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to an integer: ");
        String text = scanner.nextLine();

        try {
            // Attempt to parse the string to an integer
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            // Handle specific NumberFormatException
            System.out.println("Caught NumberFormatException: The input is not a valid integer.");
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to generate the exception
        System.out.println("Generating NumberFormatException:");
        try {
            generateException();
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException in main: The input caused a runtime exception.");
        }

        System.out.println("\nHandling NumberFormatException gracefully:");
        // Call the method to handle the exception
        handleException();
    }
}
