import java.util.Scanner;
public class EighthProgram {

    public static void main(String[] args) {
		double km;
		Scanner input=new Scanner(System.in);
		//Taking Input from the user
		km=input.nextInt();
		
		//Calculating miles from the kilometers  1 kilometers=1.6 miles
		double miles= km/1.6;
		System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
     input.close();		
	}
}	
		
		