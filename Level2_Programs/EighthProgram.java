import java.util.Scanner;

public class EighthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        //dECALRING ARRAYS
                double[] physicsMarks = new double[numberOfStudents];
        double[] chemistryMarks = new double[numberOfStudents];
        double[] mathsMarks = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

     //Taking input from user using for loop
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            physicsMarks[i] = input.nextDouble();
            while (physicsMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive marks for Physics: ");
                physicsMarks[i] = input.nextDouble();
            }
            System.out.print("Chemistry: ");
            chemistryMarks[i] = input.nextDouble();
            while (chemistryMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive marks for Chemistry: ");
                chemistryMarks[i] = input.nextDouble();
            }
            System.out.print("Maths: ");
            mathsMarks[i] = input.nextDouble();
            while (mathsMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive marks for Maths: ");
                mathsMarks[i] = input.nextDouble();
            }

            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
    //Printing the result
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", 
                              (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }

        input.close();
    }
}