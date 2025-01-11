import java.util.Scanner;
public class EighthProgram{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
		
		  System.out.println("Enter the age of Amar: ");		
		  int ageOfAmar=input.nextInt();
		  System.out.println("Enter the age of Akbar: ");		
		  int ageOfAkbar=input.nextInt();
		  System.out.println("Enter the age of Anthony: ");		
		  int ageOfAnthony=input.nextInt();
		  
		  System.out.println("Enter the height of Amar :");		
		  double heightOfAmar=input.nextDouble();
		  System.out.println("Enter the height of Akbar: ");		
		  double heightOfAkbar=input.nextDouble();
		  System.out.println("Enter the height of Anthony :");		
		  double heightOfAnthony=input.nextDouble();
          
		String Str;
        int youngestAge;

        if (ageOfAmar < ageOfAkbar && ageOfAmar< ageOfAnthony) {
            Str = "Amar";
            youngestAge = ageOfAmar;
        } else if (ageOfAkbar < ageOfAmar && ageOfAkbar < ageOfAnthony) {
            Str = "Akbar";
            youngestAge = ageOfAkbar;
        } else {
            Str = "Anthony";
            youngestAge = ageOfAnthony;
        }

        // Finding the tallest friend
        String tallestman;
        double tallestperson;

        if (heightOfAmar > heightOfAkbar && heightOfAmar > heightOfAnthony) {
            tallestman = "Amar";
            tallestperson = heightOfAmar;
        } else if (heightOfAkbar > heightOfAmar && heightOfAkbar > heightOfAnthony) {
            tallestman = "Akbar";
            tallestperson = heightOfAkbar;
        } else {
            tallestman = "Anthony";
            tallestperson = heightOfAnthony;
        }

        // Printing the results
        System.out.println("The youngest friend is " + Str + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestman + " with height " + tallestperson + " cm.");


	  // Closing the object..
		  input.close();
	  }  
}