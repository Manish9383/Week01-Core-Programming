
import java.util.Scanner;
public class SixthProgram {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);
		
	// Taking Salary from user
     System.out.print("Enter salary: ");
        double salary = input.nextDouble();
	   
	   // Taking bonus from user
	    System.out.print("Enter bonus: ");
        double bonus = input.nextDouble();
	   
	   // Calculating total income
	    double income = salary + bonus;
		
		//Printing final salary
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);
	     input.close();
    }
}
