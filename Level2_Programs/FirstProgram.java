import java.util.Scanner;

public class FirstProgram {

    // Method Which Returns an Array of Factors of a Number
    public static int[] findFactors(int number) {
        //initializing count to 0
        int count = 0;
        
       //for loop to find the factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; // Count the factors
            }
        }

        //creating an array to store the factors
        int[] factors = new int[count];
        int index = 0;

       
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

   
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }


    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }


    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2); 
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call method to find the factors
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

       
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        
        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

    
        input.close();
    }
}
