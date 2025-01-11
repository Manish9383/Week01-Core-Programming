
import java.util.Scanner;
public class TenthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);
          
		  //Declaring total variable with 0.0
        double total=0.0;
		
		
		// Taking input from user to enter the number
		System.out.println("Enter the number\n Enter 0 to stop ");
		double usersinput=input.nextInt();
		
		
		//Checking untill users enters 0 and also adding the total sum
		while(usersinput!=0)
		{
			total=total+usersinput;
			
			System.out.println("Enter another number\n Enter 0 to stop");
			usersinput= input.nextDouble();
			
		}
		
		//Printing the total sum
		System.out.println("Total sum is: "+total);
					
			 
      // Closing the object
        input.close();
    }
}
