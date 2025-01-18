import java.util.Scanner;

// Class to handle maximum number operations
class MaxNum {
    int num1, num2, num3;

    // Constructor
    MaxNum() { }

    // Method to take user input
    public void Inputt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        this.num1 = input.nextInt();
        System.out.print("Enter second number: ");
        this.num2 = input.nextInt();
        System.out.print("Enter third number: ");
        this.num3 = input.nextInt();
    }

    // Method to find the maximum of three numbers
    public int MaxFinder() {
        return Math.max(num1, Math.max(num2, num3));
    }
}

// Main class to run the program
public class MaximumDemo {
    public static void main(String[] args) {
        // Create an instance of MaxNum
        MaxNum m1 = new MaxNum();
        
        // Take input
        m1.Inputt();

        // Find and print the maximum number
        int maxii = m1.MaxFinder();
        System.out.println("Greatest Number among them is: " + maxii);
    }
}
