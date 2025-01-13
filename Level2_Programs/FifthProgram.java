import java.util.Scanner;

public class FifthProgram {
    public static void main(String[] args) {
		 
        Scanner input = new Scanner(System.in);
		
		// declaring number variable
        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();
		
		//copying number variable into temp
		int temp=number;

        int count=0;
		while(temp!=0){
			temp=temp/10;
			count++;
		}
		
		 int[] digits = new int[count];

        for (int i = 0; i <count; i++) {
            digits[i] = number % 10;
			number=number/10;
        }

        //Showing the the result
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
		
		
		
		//Closing the input object
		input.close();
		
		

    }
}