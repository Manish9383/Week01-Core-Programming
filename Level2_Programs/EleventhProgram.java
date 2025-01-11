import java.util.Scanner;

public class EleventhProgram {
    public static void main(String[] args) {
        // Creating an Scanner object for user input
        Scanner input = new Scanner(System.in);

        // taking users input
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();
		
         System.out.println("Factors of " + number + " are:");

            // Loop to find and print factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) { // Check if perfectly divisible
                    System.out.println(i); // Print the factor
                }
            }
        

        // Close the scanner
        input.close();
    }
}
