import java.util.Scanner;

public class SecondProgram {

    // Method to calculate the number of handshakes using the combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        // Validate the input to ensure there are at least 2 students
        if (students < 2) {
            System.out.println("There must be at least 2 students to form handshakes.");
        } else {
            // Calculating the maximum number of handshakes
            int handshakes = calculateHandshakes(students);

            // Displaying the result
            System.out.println("The maximum number of handshakes among " + students + " students is: " + handshakes);
        }

        // Closing the input object
        input.close();
    }
}
