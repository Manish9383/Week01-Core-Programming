import java.util.Scanner;
public class FirstProgram{
      public static void main(String [] args){
		  // Creating the scanner object
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
		  System.out.println("Enter the year ");		
		  int year=input.nextInt();
          
		//Checking the condition for leap year
        if (year > 1582) {
        
         if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
			}
			else{
				System.out.println("Invalid year. The year must be >= 1582.");
			}

	  // Closing the object (input)
		  input.close();
	  }  
}