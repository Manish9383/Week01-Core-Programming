import java.util.Scanner;

public class SeventeenthProgram {
    public static void main(String[] args) {
		
		//Creating the scanner object
        Scanner input = new Scanner(System.in);
		
		
		//Taking salary form user
		System.out.println("Enter your salary :");
		int salary=input.nextInt();
		
		
		//Taking year of experience from user
		System.out.println("Enter your year of service:");
		int service=input.nextInt();


		//Checking condition
		int bonus=0;
		if(service>5)
		{
			bonus=(salary/100)*5;
			System.out.println("Your bonus is: "+bonus);
		}
		else
		{
			System.out.println(" No bonus was there ");
		}
			
		//Closing the object..
        input.close();
    }
}