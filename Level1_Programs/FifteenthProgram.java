import java.util.Scanner;
public class FifteenthProgram{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
          System.out.println("Enter the number:");		
		  int number=input.nextInt();
		  
		int factorial=1;
		int temp=number; 
		  
		if(number>=0){  
		//For loop to calculate factorial 
          for(int i=temp;i>0;i--){
			factorial=factorial*i;
			
		  }		
		  
	    //Printing the result
		  System.out.println("Factorial of "+number+" is "+factorial);
		  
		}
		else{
		  System.out.println("Number is negative.");
		}
		  
	       //Closing the object
		  input.close();
	  }  
}