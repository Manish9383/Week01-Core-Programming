
import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
		
		
		// Creating input Scanner class
        Scanner input = new Scanner(System.in);
		
		// taking input from the user
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
		
     // Taking input from user using for loop
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employees " + (i + 1) + ": ");
            salary[i] = input.nextDouble();
            while (salary[i] <= 0) {
                System.out.print("Invalid salary! Please enter a positive number: ");
                salary[i] = input.nextDouble();
            }

            System.out.print("Enter years of service " + (i + 1) + ": ");
            yearsOfService[i] = input.nextDouble();
			
			//Using for loop
            while (yearsOfService[i] < 0) {
                System.out.print("Invalid years of service. Please enter a valid number: ");
                yearsOfService[i] = input.nextDouble();
            }

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
// printing the output
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
		
		
		//Closing the input object..
		input.close();
		
    }
}
