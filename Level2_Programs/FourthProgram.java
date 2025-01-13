// importing util package for scanner
import java.util.Scanner;

public class FourthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive numbers: ");
        int number = input.nextInt();

        while (number <= 0) {
            System.out.print("Invalid input!. Please enter positive numbers: ");
            number = input.nextInt();
        }

  
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;


        while (number != 0) {
            if (index == maxDigit) {
                
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                
                digits = temp;
            }

            digits[index] = number % 10; 
			number=number/10;
            index++;
        }

        // Initializing variables..
        int largestNumber = -1, secondLargest = -1;

        // finding largest second and largest number
        for (int i = 0; i < index; i++) {
            if (digits[i] > largestNumber) {
                secondLargest = largestNumber; 
                largestNumber = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largestNumber) {
                secondLargest = digits[i];
            }
        }

        // Showing the results
        System.out.println("largestNumber digit: " + largestNumber);
        if (secondLargest != -1) {
            System.out.println("Second largestNumber digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
		
		//closing input object...
		input.close();
    }
}
