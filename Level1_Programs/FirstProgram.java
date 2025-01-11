import java.util.Scanner;

public class FirstProgram{
	
	public static void main(String Args[])
	{
		//Creating Scanner object
		//int Students[10]=new int[];
		Scanner input= new Scanner(System.in);
		
		
		//Declearing array with size 10
		int [] Students= new int[10];
		System.out.println("Enter 10 Students age");
		
		//Taking 10 users age using for loop and storing into an array 
		for (int i=0;i<Students.length;i++)
		{
			Students[i]=input.nextInt();
			if(Students[i]<0)
			{
				System.out.println("Invalid age ");
		    }
			else if(Students[i]>=18)
			{
			System.out.println("The Student with the age "+Students[i]+" can vote.");	
				
			}
			else{
				
				System.out.println("The Student with the age "+Students[i]+" cannot vote.");
			}
		
		
		}
		
		
		//Closing the input object..
		input.close();
		
		
		
	}
}
		
			
		
		