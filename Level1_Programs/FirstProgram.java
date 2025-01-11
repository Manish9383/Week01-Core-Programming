import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
		
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
		 
		 
		 // Declaring ques variable as string
		String ques;
		
		//taking input from user
		System.out.println("Enter a number");
		int number=input.nextInt();
		
		//Checking wheather number is divisible by 5
		if(number % 5==0)
		{
			ques="Yes";
		}
		else
		{
			ques="No";
		}
		
		//Printing the  result
		System.out.println("Is the number "+number+" divisible by 5 ? "+ques);
		
	

        // Close the scanner
        input.close();
    }
}
