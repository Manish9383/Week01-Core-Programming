import java.util.Scanner;

public class NinthProgram {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Using division operator for quotient
        int remainder = number % divisor; // Using modulus operator for remainder

        // Returning both quotient and remainder in an array
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Creating a Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking input for the two numbers
        System.out.print("Enter the dividend (number): ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Checking if the divisor is zero to avoid division by zero error
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            // Calling the method to find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Printing the quotient and remainder
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        // Closing the scanner
        input.close();
    }
}
