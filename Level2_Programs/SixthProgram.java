import java.util.Scanner;

public class SixthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     

        //taking number of persons as input
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Taking height and weight as input
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] statuses = new String[numPersons];

        //Logic for taking height and weight as input
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height (in cm): ");
            heights[i] = input.nextDouble() / 100.0; 
            System.out.print("Weight (in kilograms): ");
            weights[i] = input.nextDouble();
        }

        // Calculating BMI and status for each person
        for (int i = 0; i < numPersons; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]); 
            if (bmi[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        //Printing the BMI details
        System.out.println("\nBMI Details of All Persons:");
        System.out.println("Height (m)\tWeight\t\tBMI\t\tStatus");
        
        for (int i = 0; i < numPersons; i++) {
            System.out.println(heights[i] + "\t\t" + weights[i] + "\t\t" + bmi[i] + "\t\t" + statuses[i]);
        }
        
    //Closing the input object
        input.close();
    }
}
