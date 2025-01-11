import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
		
		//Creating Scanner object
        Scanner input = new Scanner(System.in);
		
    //Taking input from the user
        System.out.print("Enter an integer: ");
        int Number = input.nextInt();

       int count = 0;
    // Checking condition
        if (Number == 0) {
            count = 1;
        } else {
            // While loop 
            while (Number != 0) {
                // Remove the last digit from the Numberber
                Number /= 10;

                // Increment the count after  checking the condition
                count++;
            }
        }

        System.out.println("The Number of digits is: " + count);

        input.close();
    }
}