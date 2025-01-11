import java.util.Scanner;

public class NinthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
 
 
			//Declearing the 2D array arraysize...
        int[][] matrix = new int[rows][columns];


		//Taking input from user
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

		//Declearing the 2D array named arraysize...
        int[] arraySize = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arraySize[index] = matrix[i][j];
				index++;
            }
        }


		//Printing the array...
        System.out.print("The 1D array is: ");
        for (int i = 0; i < arraySize.length; i++) {
            System.out.print(arraySize[i] + " ");
        }
        System.out.println();


		//Closing the input object...
        input.close();
    }
}
