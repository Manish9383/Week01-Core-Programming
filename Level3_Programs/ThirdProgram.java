import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int originalNumber = number;

        // Initialize sum variable with zero
        int sum = 0;

        // Calculating the sum of the digit
        while (number > 0) {
            int digit = number % 10; // Get the last digit from the number 
            sum=sum+digit;         // Adding the digit to the sum
            number=number/10;         // Removing the last digit from the number
        }

        // Checking the number 
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }

        // Closing the input object
        input.close();
    }
}
