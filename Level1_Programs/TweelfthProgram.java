import java.util.Scanner;

public class TweelfthProgram {

    // Method to calculate sine, cosine, and tangent for a given angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take angle in degrees as input
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Call the method to calculate trigonometric functions
        double[] trigFunctions = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("Sine of %.2f degrees: %.4f\n", angle, trigFunctions[0]);
        System.out.printf("Cosine of %.2f degrees: %.4f\n", angle, trigFunctions[1]);
        System.out.printf("Tangent of %.2f degrees: %.4f\n", angle, trigFunctions[2]);

        // Close the scanner
        input.close();
    }
}
