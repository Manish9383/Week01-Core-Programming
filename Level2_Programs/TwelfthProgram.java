import java.util.Scanner;

public class TwelfthProgram {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // using for loop
        for (int i = 100; i >= 1; i--) {
            // Checking if i is a multiple of the input number or not
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        
        // Close the input
        input.close();
    }
}