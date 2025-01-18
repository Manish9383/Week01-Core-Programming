import java.util.Scanner;

public class SpecificCharacter
 {
	 
	 public static String chara(String str,char ch){
		 
		 String str2="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch)
			{
				str2+=str.charAt(i);
			}
			
			
		}
		return str2;
	 }
		 	 
		 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter the string:");
        String str2 = scanner.nextLine();

        System.out.println("Enter the character to remove:");
        char charToRemove = scanner.next().charAt(0);

        
        String answer = chara(str2,charToRemove);

  
        System.out.println("String after removing '" + charToRemove + "': " + answer);

        scanner.close();
    }
}
