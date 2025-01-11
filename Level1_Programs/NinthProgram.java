
import java.util.Scanner;
public class NinthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number ");
        int counter = input.nextInt();
		
		//countdown the counter by decrementing
		for(int i=counter;i>=1;i--)
		{
			System.out.println(i);
		}
			 
      // Closing the object
        input.close();
    }
}
