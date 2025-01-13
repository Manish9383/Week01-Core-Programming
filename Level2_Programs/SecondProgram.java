import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
		
		//Creating the Scanner object
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
		
        int[] age = new int[3];
        double[] height = new double[3];
		
        // For Loop for taking 3 inputs from user
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of the " + names[i] + ": ");
            age[i] = input.nextInt();

            System.out.print("Enter height of the " + names[i] + ": ");
            height[i] = input.nextDouble();
        }

        int youngest = 0;
		int tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }
		
		 //Printing the result
        System.out.println("Youngest Friend: " + names[youngest]);
        System.out.println("Tallest Friend: " + names[tallest]);
		
		
		//Closing the input object
		input.close();
		
    }
}
