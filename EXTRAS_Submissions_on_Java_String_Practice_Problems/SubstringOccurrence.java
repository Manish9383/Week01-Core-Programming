
import java.util.Scanner;
public class SubstringOccurrence {
   
		
		
		 public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
			index=index+subString.length();
        }

        return count;
    }
	
      /*
	  Example  input -"hellohellohello";
               output ----hello";
	*/
	
	 public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter main string:");
        String mainstr = scanner.next();
		
		
		 System.out.println("Enter Substring string:");
        String substr = scanner.nextLine();
		
		
        
        int count = countOccurrences(mainstr, substr);
        System.out.println("The substring '" + substr + "' occurs " + count + " times in the main string.");
    }

   
}

