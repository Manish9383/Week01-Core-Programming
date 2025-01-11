import java.util.Scanner;

public class ThirteenthProgram {
    public static void main(String[] args) {
		
		//Creating the scanner object
        Scanner input = new Scanner(System.in);


		//Taking input from the user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Checking if the number is a natural number or not
        if (number >= 0) {
            // Sum through for loop
            int forLoop = 0;
            for(int i=1; i<=number;i++){
				forLoop+=i;
            }

            // Sum using formula of sum of n natuural numbers
            int sum = number * (number + 1) / 2;

            // Comparing results from the both sum values 
            if (forLoop == sum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("These were not same.");
            }
        } 
		
		//Closing the object..
        input.close();
    }
}