import java.util.Scanner;
public class SixteenthProgram {

    public static void main(String[] args) {
		
	//Creating Scanner object
	Scanner input=new Scanner(System.in);
	
	//Taking Input
	int numberOfStudents =input.nextInt();
	
	int handShakes=(numberOfStudents*(numberOfStudents-1))/2;
	
	//Printing the results
	System.out.println("Number of Possible Handshakes: "+handShakes);
	
	input.close();
	}
}
	
	