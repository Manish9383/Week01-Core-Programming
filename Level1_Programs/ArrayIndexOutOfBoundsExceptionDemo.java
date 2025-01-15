import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        // Access an index larger than the array length
        System.out.println("Accessing an invalid index:");
        System.out.println("Name at index " + n + ": " + names[n]); // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("Accessing an invalid index with exception handling:");
        try {
            System.out.println("Name at index " + n + ": " + names[n]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index accessed.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to generate the exception
        System.out.println("Generating ArrayIndexOutOfBoundsException:");
        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in main: Invalid index accessed.");
        }

        System.out.println("\nHandling ArrayIndexOutOfBoundsException gracefully:");
        // Call the method to handle the exception
        handleException();
    }
}
