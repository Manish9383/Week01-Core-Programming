
public class FourthProgram{
	public static void main(String args[])
	{
		int costPrice=129;
		int sellingPrice=191;
		
		int Profit= sellingPrice-costPrice;// Calculating Profit
		double profitPercentage= ((double)Profit / (double)costPrice)*100;//Calculating profit percentage
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\n"+"The Profit is INR "+Profit+" and the Profit Percentage is "+profitPercentage);
	}
}	