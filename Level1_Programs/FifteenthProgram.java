import java.util.Scanner;
public class FifteenthProgram {

    public static void main(String[] args) {
		
	//Creating Scanner object
	Scanner input=new Scanner(System.in);
	
	//Taking Input
	int unitPrice =input.nextInt();
	
	int quantity =input.nextInt();
	
	
	int purchase = unitPrice*quantity;
	//Printing the results
	System.out.println("The total purchase price is INR "+purchase+" if the quantity "+unitPrice+" and unit price is INR "+quantity);
	
	input.close();
	}
}
	
	