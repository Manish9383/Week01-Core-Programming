
import java.util.Scanner;
public class TenthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);
		
		
		//Taking Input from user
		System.out.print("Enter number of chocolates: ");
        int chocolates = input.nextInt();
        System.out.print("Enter number of children: ");
        int children = input.nextInt();
		
		 // Calculating Chocolates per child  
		 int chocolatesPerChild = chocolates / children;
		 
		 // Calculating remaining chocolates
        int remainingChocolates = chocolates % children;
		
		// Printing final result
		 System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
	     input.close();
    }
}
