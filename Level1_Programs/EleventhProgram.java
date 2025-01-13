import java.util.Scanner;

public class EleventhProgram {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Using the given formula to calculate the wind chill
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking temperature and wind speed as input from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Calling the method to calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Displaying the calculated wind chill temperature
        System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);

        // Closing the input scanner
        input.close();
    }
}
