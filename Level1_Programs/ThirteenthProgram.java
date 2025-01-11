import java.util.Scanner;
public class ThirteenthProgram {

    public static void main(String[] args) {
		
	//Creating Scanner object
	Scanner input=new Scanner(System.in);
	double perimeter=input.nextDouble();
	
     // Calculate the side of the square
     double side = perimeter / 4;

      // Print the result
      System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}