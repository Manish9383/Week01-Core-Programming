import java.util.Scanner;

public class  ThirdProgram{

    public static void main(String[] args) {
		
		//Creating Scanner object
        Scanner input = new Scanner(System.in);

        // taking Input marks from user for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt();

        // Calculating total,average,and percentage
        int total = physics + chemistry + maths;
        double averageMarks = total/3.0;
        double percentage = (total / 300.0) *100;

        //Finding grade and remarks
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "At agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Printing results
        System.out.println("\nResults:");
        System.out.printf("Average Marks: %.2f\n", averageMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);


		//Closing the object (input)...
        input.close();
    }
}