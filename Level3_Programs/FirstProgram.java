import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
		//Creating scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();


		//Declearing number into temp
        int temp = number; 
        int Addition = 0;                

		//Conditions
        while (temp != 0) {
            int remainder = temp % 10;

            Addition += Math.pow(remainder, 3);

            temp /= 10;
        }
		//Checkinig conditions
        if (Addition == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }


		//Closing input object
        input.close();
    }
}