import java.util.Scanner;

public class StringSubstring {
	  public static String createSubstringUsingCharAt(String text, int start, int end) {
		  String str1;
		  for(int i=start;i<end;i++)
		  {
			  str1+=text.charAt(i);
			  
		  }
		  return str1;
        
    }
 
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

       
        String substring1 = createSubstringUsingCharAt(text, startIndex, endIndex);


        String substring2 = text.substring(startIndex, endIndex + 1); 

        // Compare substrings
        boolean areEqual = compareStrings(substring1, substring2);

        // Display results
        System.out.println("Substring using charAt(): " + substring1);
        System.out.println("Substring using substring() method: " + substring2);

        if (areEqual) {
            System.out.println("The two substrings are equal.");
        } else {
            System.out.println("The two substrings are not equal.");
        }

        scanner.close();
    }

  
}