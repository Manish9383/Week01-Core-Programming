import java.util.Scanner;

public class TwelfthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


		//Taking natural number from user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number (>= 0)
        if (number >= 0) {
			
            // Sum through while loop
            int Sum1 = 0;
            int i = 1;
			
			//Calculating the n natural sum
            while (i <= number) {
                Sum1 =Sum1+i;
                i++;
            }

            // Sum using formula of sum of natural numbers
            int sum = number * (number + 1) / 2;

            // Comparing results from the inital sum value
            if (Sum1 == sum) {
                System.out.println("Both computations was correct.");
            } else {
                System.out.println("This was not same.");
            }
        } 
		
		//Closing the object..
        input.close();
    }
}