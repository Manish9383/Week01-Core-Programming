import java.util.Scanner;

public class SecondProgram{
	
	public static void main(String Args[])
	{
		//Creating Scanner object
	
		Scanner input= new Scanner(System.in);
		
		
		//Declearing array with size 10
		int [] Users= new int[5];
		System.out.println("Enter 5 numbers");
		
		
		//taking users input and checking all the conditions
		for(int i=0;i<Users.length;i++)
		{
			
		Users[i]=input.nextInt();
		
		if(Users[i]>0)
		{
			
			if(Users[i]%2==0)
			{
				System.out.println("Number is even");
			}
			else{
				System.out.println("Number is odd");
				
			}
		}
		else if(Users[i]==0)
		{
			System.out.println("Number is Zero");
		}
		else{
			System.out.println("Number is negative");
			
		}
		
			
		}
		//Checking the number is equal , lesser  or greater 
		if(Users[0]==Users[Users.length-1])
		{
			System.out.println("Both numbers are Equal");
		}
		else if(Users[0]>Users[Users.length-1])
		{
			System.out.println("First Element is greater then last number");
		}
		else{
			System.out.println("First Element is lesser then last number");
		}
		
		
		
		
		//Closing the input object..
		input.close();
		
		
		
	}
}
		
			
		
		