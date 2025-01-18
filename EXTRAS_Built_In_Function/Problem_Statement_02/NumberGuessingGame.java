import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100 and keep it in your mind.");
        System.out.println("I will try to guess your number.");
        
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;
        
        while (!guessedCorrectly) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter 'H' if my guess is too high, 'L' if it's too low, or 'C' if it's correct:");
            char feedback = scanner.next().toUpperCase().charAt(0);
            
            switch (feedback) {
                case 'H':
                    high = guess - 1;
                    break;
                case 'L':
                    low = guess + 1;
                    break;
                case 'C':
                    guessedCorrectly = true;
                    System.out.println("Hooray! I guessed your number: " + guess);
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'H', 'L', or 'C'.");
            }
        }
        scanner.close();
    }

    public static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }
}
