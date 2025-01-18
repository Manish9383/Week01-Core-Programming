import java.util.Scanner;


public class VowelsandConsonants{
	
	public static int[] VowelsAndConso(String vowel, int []arr)
	{
		int vow=0;
		int conso=0;
		for(int i=0;i<vowel.length();i++)
			
			{
				if((vowel.charAt(i)=='a') || (vowel.charAt(i)=='e') || (vowel.charAt(i)=='i') || (vowel.charAt(i)=='o') || (vowel.charAt(i)=='u'))
				{
					arr[0]++;
				}
				else
				{
					arr[1]++;
				}	
			}
			return arr;
	}
	
	
	
	
	public static void main(String args[])
	
	{
		int[] arr= {0,0};
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter an String");
		String str= input.nextLine();
		int values[]=VowelsAndConso(str,arr);
		System.out.println("Number of Vowels :"+arr[0]);
		System.out.println("Number of consonents is :"+arr[1]);
			
		
	}
}