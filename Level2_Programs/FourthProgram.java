import java.util.Scanner;

public class FourthProgram {
    public static void main(String[] args) {
		
		//Creating scanner object
        Scanner input = new Scanner(System.in);


		//Taking users input
        System.out.print("Enter a number: ");
        int number = input.nextInt();


		//Declearing boolean variable to true
        boolean isPrime = true;

        // if a number less than or equal to 1 then it is not prime
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
   //cheking conditions
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }


		//Closing the object (input)..
        input.close();
    }
}