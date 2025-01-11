import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
        // Creating a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Taking users input
        System.out.print("Enter a number :");
        int number = scanner.nextInt();

     
        int[] table = new int[10];

        //Multiplication table using for loop
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Printing the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        // Close the scanner
        scanner.close();
    }
}
