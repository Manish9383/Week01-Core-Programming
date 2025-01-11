import java.util.Scanner;
public class FourthProgram{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
		  
          System.out.println("Enter number: ")	;	
		  int number=input.nextInt();
		  int natural=0;
		  if(number>=0)
		  {
			  natural=(number*(number+1))/2;
			  System.out.println("The sum of "+number+" natural numbers is "+natural);
		  }
		  else
		  {
			  System.out.println("The number "+number+" is not a natural number");
		  }
		  
		//Closing the object..
		  input.close();
	  }  
}