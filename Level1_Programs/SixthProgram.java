
public class SixthProgram{
	public static void main(String args[])
	{ 
	int fee= 125000;
	int discountPercent=10;
	
	// Calculating discount from the fees
	double discount= 125000/10;
	
	// Calculating final fees after discount
	double finalFees=fee-discount;
	
	System.out.println("The discount amount is INR "+discount +" and final discounted fee is INR "+finalFees);
	}
}