
import java.util.Scanner;
public class FourthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);
		
	
      System.out.print("Enter temperature in Celsius: ");
	  
	  //Taking input from users
       double celsius = input.nextDouble();
	   
	   // Calculating Fahrenheit 
       double fahrenheit = (celsius * 9 / 5) + 32;
	   
	   // Printing Result
         System.out.println("The " + celsius + " Celsius is " + fahrenheit + " fahrenheit.");
	     input.close();
    }
}