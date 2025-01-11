import java.util.Scanner;

public class TenthProgram {
    public static void main(String[] args) {
        // Creating a scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initializing result=1
        int result = 1;

        // for loop for calculating the power
        for (int i = 1; i <= power; i++) {
     
			result =result*number;
        }

        // Printing the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Closing the scanner
        scanner.close();
    }
}
