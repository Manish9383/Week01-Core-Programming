
import java.util.Scanner;
public class EighteenthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number from 6 to 9: ");
        int number = input.nextInt();

        // Using a for loop to generate multiplication of number between 6 to 9
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner
        input.close();
    }
}
