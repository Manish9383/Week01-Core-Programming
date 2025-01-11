import java.util.Scanner;
public class TwelfthProgram{

    public static void main(String[] args) {
		
	//Creating Scanner object
	Scanner input=new Scanner(System.in);
	
	
	//Taking input from user
	double base=input.nextDouble();
	double height=input.nextDouble();
	
	
	//Calculating Area of triangle
	double area=((double)1/2)*base*height;
	
	
	//Printing the results
	System.out.println("Area of a Triangle is: "+area);
	input.close();
	}
}
	
