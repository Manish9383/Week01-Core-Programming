import java.util.Scanner;

public class NinthProgram {
    public static void main(String[] args) {
        // Creating the Scanner object 
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its greatest factor (beside itself): ");
        int number = input.nextInt();

        // Initialize greatestFactor to 1
        int greatestFactor = 1;

        // for loop for find the greatest factor of the number 
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Checking if the number is divisible by i or not
                greatestFactor = i; // Assign i to the greatest factor
                break; // Exit the loop 
            }
        }

        // Printing the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        // Closing the scanner
        input.close();
    }
}
