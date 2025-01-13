import java.util.Scanner;

public class ThirdProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting user for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate that the number of students is at least 2
        if (numberOfStudents < 2) {
            System.out.println("A minimum of 2 students is required to make handshakes.");
        } else {
            // Calculating the maximum number of handshakes
            int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Displaying the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + totalHandshakes);
        }

        // Closing the scanner object
        input.close();
    }
}
