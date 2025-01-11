import java.util.Scanner;
public class SecondProgram{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking input  
		  int number1=input.nextInt();
		  int number2=input.nextInt();
		  int number3=input.nextInt();
		  
		  String result;
		  
		  
		//checking condition for smallest
		  if(number1<number2 && number1<number3){
		     result="Yes";
		  }
		  else{
		     result="No";
		  }
		 
		  
		  
		//Printing the result
          System.out.println("Is the first number the smallest? "+result);		
		  
		  input.close();
	  }  
}