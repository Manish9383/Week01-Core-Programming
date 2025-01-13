
import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
		
		//Creating Scanner object
        Scanner input = new Scanner(System.in);
        int number, index = 0;
        int maxDigit = 10;
        int[] digits = new int[maxDigit];


		//Taking user input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        //Using while loop
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;

            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                
                
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                
                digits = temp;
            }
        }

     //another condition
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
		
		//Showing the results
        System.out.println("Largest Digit is: " + largest);
        System.out.println("Second Largest Digit is: " + secondLargest);
		
		
		
	//Closing the object
		input.close();
    }
}
