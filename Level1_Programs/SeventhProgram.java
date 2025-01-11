import java.util.Scanner;
public class SeventhProgram{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input from the user
		  //Taking month number
          System.out.println("Enter month number: ")	;	
		  int month=input.nextInt();
		  
		  
		  //Taking day 
		  System.out.println("Enter day: ")	;	
		  int day=input.nextInt();

	
		  
		//checking condition for spring season
		  if(month==3&&day>=20){
		     System.out.println("Its a Spring Season");
		  }
		  else if(month==6&&day<=20){
		     System.out.println("Its a Spring Season");
		  }
		  else if(month>3 && month<6){
		     System.out.println("Its a Spring Season");
		  }
		  else{
			  System.out.println("Not a Spring Season");
		  }
		  
		//Closing the object..
		  input.close();
	  }  
}