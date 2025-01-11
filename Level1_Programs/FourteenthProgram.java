import java.util.Scanner;
public class FourteenthProgram {

    public static void main(String[] args) {
		
	//Creating Scanner object
	Scanner input=new Scanner(System.in);
	
	//Taking Input
	double distanceInFeet=input.nextDouble();
	
	//Calculating Distance in yards
	double distanceInYard=distanceInFeet/3;
	
	
	//Calculating Distance in Miles
	double distanceInMiles=distanceInYard/1760;
	
	//Printing the results
	System.out.println("Distance in Feet is "+distanceInFeet+" while in yard is "+distanceInYard+" and in mile is "+distanceInMiles);
	input.close();
	}
}
	
	