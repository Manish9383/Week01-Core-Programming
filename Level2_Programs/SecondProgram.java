// Import required libraries
import java.util.Scanner;

public class SecondProgram {

   
    public static void main(String Args[]) {
         Scanner input = new Scanner(System.in);
		 
		 //Taking input from users
        System.out.println("Enter a");
        int a = input.nextInt();
        System.out.println("Enter b");
        int b = input.nextInt();
        System.out.println("Enter c");
        int c = input.nextInt();


         // Calculating the operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;


         //Printing the results
        System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
		input.close();
		
    }
}
