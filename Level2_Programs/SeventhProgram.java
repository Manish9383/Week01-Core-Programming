
import java.util.Scanner;
public class SeventhProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);
		
		
		//Taking Numbers from user
	System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
		
		//Swaping
		int temp = number1;
        number1 = number2;
        number2 = temp;
		
		
		//Printing Swapped values
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
	     input.close();
    }
}
