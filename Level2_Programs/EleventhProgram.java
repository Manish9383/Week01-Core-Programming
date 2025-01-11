
import java.util.Scanner;
public class EleventhProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);
		
		//Taking input from user
		System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter time in years: ");
        double time = input.nextDouble();
		
		
		// Calculating interest
		 double interest = (principal * rate * time) / 100;
		
		
		//Printing The simple interest
		  System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    
	     input.close();
}
}
   
