
import java.util.Scanner;
public class TwelfthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		
		// Taking input from users
        double pounds = input.nextDouble();
		
		// Calculating Kilograms from pounds
        double kilograms = pounds / 2.2;
		
		//Printing Result
        System.out.println("The weight of the person in pounds is " + pounds + " and in kilograms is " + kilograms);
	     input.close();
}
}
   
