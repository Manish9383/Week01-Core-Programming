import java.util.Scanner;

public class TenthProgram {
    public static void main(String[] args) {
		
		// Creating scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();


      //Checking for postive number
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }


		//Declaring the array...
        String[] fizzBuzzArr = new String[number + 1];


		//Checking all the neccessary conditions
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArr[i] = "FizzBuzz";//fizzbuzz
            } else if (i % 3 == 0) {
                fizzBuzzArr[i] = "Fizz";//fizz
            } else if (i % 5 == 0) {
                fizzBuzzArr[i] = "Buzz";//buzz
            } else {
                fizzBuzzArr[i] = i + ""; 
            }
        }


		//printing the result
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzArr[i]);
        }


         //Closing the input object..
        input.close();
    }
}
