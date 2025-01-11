import java.util.Scanner;
public class TenthProgram {

    public static void main(String[] args) {
		
	//Creating Scanner object
	Scanner input=new Scanner(System.in);
	//Taking height as input from user in cm
	double height=input.nextDouble();
	
	//Calculating inches from cm
    double inches= height/2.54;
	
	//Calculating Feet from inches
	double inFeet= inches/12;
	
	//Printing the result
System.out.println("Your Height in cm is "+height+" while in feet is "+inFeet+" and inches is "+inches);
input.close();
	}
}	