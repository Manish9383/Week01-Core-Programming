import java.util.Scanner;
public class ThirdProgram{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  from the user
		  
		  System.out.println("Enter 3 numbers : ");
		  int number1=input.nextInt();
		  int number2=input.nextInt();
		  int number3=input.nextInt();
		  
		  String Result1="No",Result2="No",Result3="No";
		  
		  
		//checking condition for greatest number among three of them
		  if(number1>number2 && number1>number3){
		     Result1="Yes";
		  }
		  else if(number2>number1 && number2>number3){
		     Result2="Yes";
		  }
		  else if(number3>number1 && number3>number2){
		     Result3="Yes";
		  }
		 
		  
		  
		//printing the result
          System.out.println("Is the first number the largest? "+ Result1+"\nIs the second number the largest? "+Result2 +"\nIs the third number the largest? "+Result3 );		
		  
		  
		  //Closing the object(input)
		  input.close();
	  }  
}