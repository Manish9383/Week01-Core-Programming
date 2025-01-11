
import java.util.Scanner;
public class FifthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);
		
	
     System.out.print("Enter temperature in Fahrenheit: ");
     
	  
	  //Taking input from users
         double fahrenheit = input.nextDouble();
	   
	   // Calculating Fahrenheit 
       double celsius = (fahrenheit - 32) * 5 / 9;
	   
	   // Printing Result
         System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
	     input.close();
    }
}
