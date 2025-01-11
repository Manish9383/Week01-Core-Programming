import java.util.Scanner;
public class FirstProgram {

    public static void main(String[] args) {
		
	//Creating Scanner object
	Scanner input=new Scanner(System.in);
	
	//Taking two input from user
	int number1=input.nextInt();
	int number2=input.nextInt();
	
	
	//Calculating quotient
	int quotient=number1/number2;
	
	//Calculating reminder
	int reminder=number1%number2;
	
	
	//Printing the results
	System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number "+number1+" and "+number2);
	
	
	// Closing the object
	input.close();
	}
}