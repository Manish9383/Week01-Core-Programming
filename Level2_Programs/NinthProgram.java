import java.util.Scanner;
public class NinthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);
		
	//Taking sides of triangle from user
	  System.out.print("Enter side1 ");
        double side1 = input.nextDouble();


        System.out.print("Enter side2");
        double side2 = input.nextDouble();

        System.out.print("Enter side3");
        double side3 = input.nextDouble();
		
		//Calculating perimeter of triangle
		double perimeter = (side1+side2+side3);
		
		//Calculating rounds
		double rounds = 5000 / perimeter;
		
		//Printing total numbers of rounds the athlete will run..
		System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");

	     input.close();
    }
}