
import java.util.Scanner;
public class Toggle {
   
	
public static String toggle(String str) {
        String result = ""; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            }
         
            else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            }
           
            else {
                result += ch;
            }
        }
        return result;
    }

    
	 public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string :");
        String lowerStr = scanner.next();
	   

	   String tg= toggle(lowerStr);
        System.out.println("Coverted string : " +tg);
		
    }

   
}

