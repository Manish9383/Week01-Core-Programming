
import java.util.Scanner;
public class SixthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if(number==0)
			System.out.println("Zero");
		else if(number>0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
		

        // Close the scanner
        input.close();
    }
}
