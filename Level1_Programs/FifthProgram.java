
import java.util.Scanner;
public class FifthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter age: ");
        int age = input.nextInt();
		
		
		//Checking  weather he/she can vote or not
		 if(age>=18)
		 { 
			 System.out.println("The Person's age is "+age+" and can vote.");
		 }
		 else{
			 System.out.println("The Person's age is "+age+" and cannot vote.");
		 }
			 
      // Closing the object
        input.close();
    }
}
