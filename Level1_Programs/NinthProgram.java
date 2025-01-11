import java.util.Scanner;
public class NinthProgram {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
       double fee;
	//Taking input fee from user
	fee= input.nextDouble();
	
	int discountPercent;
	//Taking discount percent from user
	discountPercent= input.nextInt();
	
	// Calculating discount from the fees
	double discount= (fee/100)*discountPercent;
	
	// Calculating final fees after discount
	double finalFees=fee-discount;
	
	System.out.println("The discount amount is INR "+discount +" and final discounted fee is INR "+finalFees);
	input.close();
	}
}