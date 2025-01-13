import java.util.Scanner;

public class SeventhProgram {

    // Method to calculate the sum of first n natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // Adding each number to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking input for the number n
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // Checking if the input is a positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calling the method to calculate the sum and printing the answer
            int answer = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + answer);
        }

        // Closing the scanner object
        input.close();
    }
}
