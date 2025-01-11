import java.util.Scanner;
public class EleventhProgram {

    public static void main(String[] args) {
		
	//Creating Scanner object
	Scanner input=new Scanner(System.in);
	
	//taking input
	float number1=input.nextFloat();
	float number2 =input.nextFloat();
	
	//operations
	float addition=number1+number2;
	float substraction=number1-number2;
	float multiplication = number1*number2;
	float division= number1/number2;
	
	//Printing the Results
	
	System.out.println("The addition, substraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition+", "+substraction+", "+multiplication+", and "+division);
	input.close();
	}
}
	
	
