import java.util.Scanner;

public class FifthProgram {
    public static void main(String[] args) {
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        /
        int[] result = new int[4]; // Array to store results for 6, 7, 8, and 9

        // Using a for loop to calculate table
        for (int i = 6; i <= 9; i++) {
            result[i - 6] = number * i; //Storing the result into an array
        }

        // Printng the table
        System.out.println("Multiplication Table of " + number + " (from 6 to 9):");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[i - 6]);
        }

        // Closing the scanner
        input.close();
    }
}
