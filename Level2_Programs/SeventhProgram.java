import java.util.Scanner;

public class SeventhProgram {

    public static void main(String[] args) {
		
		//Creating Scanner class
        Scanner input = new Scanner(System.in);

        // Taking Input from the user
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightInCm = input.nextDouble();

        // Cacculating height from cm to meters
        double heightInMeter= heightInCm / 100;

        // Calculated BMI
        double bmi = weight / (heightInMeter* heightInMeter);

        // Determining Weight
        String status;
        if (bmi < 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.4 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Printing results
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

      input.close();
    }
}