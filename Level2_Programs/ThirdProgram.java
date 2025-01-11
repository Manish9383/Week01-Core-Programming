
import java.util.Scanner;
public class ThirdProgram {

   
    public static void main(String Args[]) {
        Scanner input = new Scanner(System.in);
		
		//Taking input from users
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();



          // Calculating the operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;


		//Printing the results
        System.out.println("The results of Double Operations are: " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
		
	     input.close();
    }
}