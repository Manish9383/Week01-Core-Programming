import java.util.Scanner;

public class SixthProgram {
    public static void main(String[] args) {
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);

     
        
       double [] heights = new double [11]; //Array 
         double sum=0;
		 double numberOfElements=11;
        // Using a for loop to take input
        for (int i = 0; i <heights.length; i++) {
			System.out.println("Enter your Height");
            heights[i] = input.nextDouble();
			sum=sum+heights[i];
        }
      double meanHeight=sum/numberOfElements;
	  
	  
	  System.out.printf("Mean height of the football team is %.2f", meanHeight);

        // Closing the scanner
        input.close();
    }
}
