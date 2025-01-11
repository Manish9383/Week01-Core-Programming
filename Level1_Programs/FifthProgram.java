
public class FifthProgram{
	public static void main(String args[])
	{ 
	     int totalPens=14;
		 int numbersOfStudents=3;
		 
	     //Calculating pen per students
		int penPerStudents = totalPens/numbersOfStudents;
		
		//Calculating remainingPens
		int remainingPens = totalPens%numbersOfStudents;
		
		System.out.println("The Pen Per Student is "+penPerStudents+" and the remaining pen not distributed is "+remainingPens);
	}
}
