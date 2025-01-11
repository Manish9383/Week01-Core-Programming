import java.util.Scanner;

public class SeventhProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Please enter positive natural number.");
            System.exit(0);
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddNumberIndex = 0;
        int evenNumberIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenNumberIndex] = i;
				evenNumberIndex++;
            } else {
                odd[oddNumberIndex] = i;
				oddNumberIndex++;
            }
        }

        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddNumberIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenNumberIndex; i++) {
            System.out.print(even[i] + " ");
        }
     

        input.close();
    }
}
