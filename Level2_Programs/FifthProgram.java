import java.util.Scanner;

public class FifthProgram{

    public static void main(String[] args) {
		
	  //creating the scanner object
        Scanner input = new Scanner(System.in);

      //taking input from the user
        System.out.print("Enter an number: ");
        int number = input.nextInt();
		
		//Checking the condition
    if(number>=0){
      for(int i=0;i<=number;i++){
		  if(i%3==0 && i%5==0){
		     System.out.println("FizzBuzz");
		  }
          else if(i%3==0){
             System.out.println("Fizz");		  
		  }	
          else if(i%5==0){
             System.out.println("Buzz");		  
		  }
          else{
			 System.out.println(i); 
		  }		  
	  }
	}
	else{
		System.out.println(" Invalid Input");
	}
		
		//Closing the object
		input.close();
	}
}