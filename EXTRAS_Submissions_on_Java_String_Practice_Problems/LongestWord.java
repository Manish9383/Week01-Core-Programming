import java.util.Scanner;

public class LongestWord{
	
	
	 public static String findLongestWord(String sentence) {
		 {
			 String longest=" ";
			 String[] words= sentence.split("\\s+");
			 
			 for(String str:words)
			 {
				 if(str.length()>longest.length())
				 {
					 longest=str;
				 }
			 }
			return longest;
			 
		 }
	 }
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word is: " + longestWord);
    }

   
}

