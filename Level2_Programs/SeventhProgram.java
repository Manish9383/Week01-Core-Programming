import java.util.Scanner;

public class SeventhProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Declaring arrays 
        double[][] details = new double[numberOfPersons][3];
        String[] weight = new String[numberOfPersons];   

       
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            
            for (int j = 0; j == 0;) { 
                System.out.print("Enter height in cm : ");
                details[i][0] = input.nextDouble();
                if (details[i][0] > 0) {
                    break; 
                }
                System.out.println(" Please enter a positive height.");
            }

      
            for (int j = 0; j == 0;) { 
                System.out.print("Enter weight in kg: ");
                details[i][1] = input.nextDouble();
                if (details[i][1] > 0) {
                    break; 
                }
                System.out.println(" Please enter a positive weight.");
            }

            // Converting height to meters
            double height = details[i][0] / 100.0;

            // Calculating BMI
            details[i][2] = details[i][1] / (height * height);

            // BMI status
            if (details[i][2] <= 18.4) {
                weight[i] = "Underweight";
            } else if (details[i][2] <= 24.9) {
                weight[i] = "Normal";
            } else if (details[i][2] <= 39.9) {
                weight[i] = "Overweight";
            } else {
                weight[i] = "Obese";
            }
        }

        // Printing results
        System.out.println("\nBMI Details of All Persons:");
        System.out.println("Height (cm)\tWeight (kg)\tBMI\t\tStatus");

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.1f\t\t%.1f\t\t%.2f\t\t%s\n",
                    details[i][0], details[i][1], details[i][2], weight[i]);
        }

        // Closing the input object
        input.close();
    }
}
