import java.util.Scanner;
public class SixteenthProgram{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
		  System.out.print("Enter a  number: ");
		  int number=input.nextInt();
		  
		// Checking if the number is a natural number  
        if (number >= 1) {
			for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }

        // Close the scanner
        input.close();
		}
	  }
}