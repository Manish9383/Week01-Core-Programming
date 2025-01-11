import java.util.Scanner;

public class EighthProgram {
    public static void main(String[] args) {
        // creating Scanner object 
        Scanner input = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter name ");
        String name = input.nextLine();
        System.out.print("Enter starting city: ");
        String fromCity = input.nextLine();
        System.out.print("Enter a via city: ");
        String viaCity = input.nextLine();
        System.out.print("Enter the destinationcity: ");
        String toCity = input.nextLine();

        // Converting Distances into miles
        System.out.print("Enter distance from: " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = input.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = input.nextDouble();

        // Time taking in hours from user
        System.out.print("Enter time taken in hours: ");
        double timeTaken = input.nextDouble();

        // Calculating total distance and average speed from the route and final city
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        // Printing the results
        System.out.println("Name : " + name); 
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " miles per hour");

        // Close the scanner
        input.close();
    }
}