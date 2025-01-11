
import java.util.Scanner;
public class EighthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number ");
        int counter = input.nextInt();
		
		
		while(counter!=0)
		{
			System.out.println(counter);
			counter--;
		}
			 
      // Closing the object
        input.close();
    }
}
