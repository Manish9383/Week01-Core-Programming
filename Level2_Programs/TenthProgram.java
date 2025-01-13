import java.util.Scanner;
public class TenthProgram {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numInput = input.nextInt();

        //Initializing an array to store the frequency of each digit
        int digitFrequency[] = new int[10];

        while (numInput != 0) {
            int digit = numInput % 10; 
            digitFrequency[digit]++;     
            numInput /= 10;           
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i] > 0) { 
                System.out.println("Digit " + i + ": " + digitFrequency[i] + " time(s)");
            }
        }

        input.close();//Closing the scanner object
    }
}