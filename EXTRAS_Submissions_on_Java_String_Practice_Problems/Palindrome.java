import java.util.Scanner;


public class Palindrome{
	
	public static boolean Palin(String str1)
	{
		 String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i);
        }
        
		if(reversed.equals(str1))
		{
			return true;
		}
		return false;
		
	}
	
	
	
	public static void main(String Args[])
	{
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter an String");
		String str= input.nextLine();
		
       boolean pali = Palin(str);
        System.out.println("String is  " + pali);
	}
}
		
	
	