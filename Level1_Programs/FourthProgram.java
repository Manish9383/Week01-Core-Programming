import java.util.Scanner;

public class FourthProgram {

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate how many rounds are needed to complete 5 km
    public static int calculateRounds(double perimeter) {
        // 1 km = 1000 meters, so 5 km = 5000 meters
        double totalDistance = 5000;
        return (int) Math.ceil(totalDistance / perimeter);  // Round up to the nearest whole number
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the sides of the triangle
        System.out.print("Enter the length of the first side of the triangle (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of the second side of the triangle (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of the third side of the triangle (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculate the number of rounds needed to complete 5 km
        int rounds = calculateRounds(perimeter);

        // Output the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        // Close the input scanner
        input.close();
    }
}
