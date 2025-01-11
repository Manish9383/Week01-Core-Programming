import java.util.Scanner;

public class FourthProgram {
    public static void main(String[] args) {
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);

       // Creating an array
        double[] arr = new double[10];
		
		double total=0.0;
		int index=0;
		
		while(true)
		{
			if(index<10)
			{
				System.out.println("Enter a number :");
				arr[index]=input.nextDouble();
				if(arr[index]<=0)
				{
					break;
				}
				//total=total+arr[index];
				index++;
				
			}
			else
			{
				break;
			}
		}
		for(int i=0;i<index;i++)
		{
			total=total+arr[i];

		}
		System.out.println("Total sum is "+total);
			
        // Close the scanner
        input.close();
    }
}
