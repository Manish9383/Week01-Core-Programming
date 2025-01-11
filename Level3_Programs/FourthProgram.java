import java.util.Scanner;

public class FourthProgram {
    public static void main(String[] args) {
        // Creating an Scanner object 
        Scanner input = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // declaring sum variable with zero
        int sum = 0;

        // Finding the divisor and calculating their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { 
                sum =sum+i;    
            }
        }

        // Checking the condition
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        // Closing the input object
        input.close();
    }
}
