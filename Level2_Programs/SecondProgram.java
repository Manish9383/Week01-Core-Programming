import java.util.Scanner;

public class SecondProgram {

    public static void main(String[] args) {
		//Creating object from scanner class
        Scanner input = new Scanner(System.in);

          //taking input from user
        System.out.print("Enter the year : ");
        int year = input.nextInt();


        //Checking condition for leap year
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is Leap Year.");
        } else {
            System.out.println(year + " is not Leap Year.");
        }

       //Closing the object...
        input.close();
    }
}