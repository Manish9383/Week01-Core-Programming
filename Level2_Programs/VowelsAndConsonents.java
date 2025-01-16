import java.util.Scanner;

public class VowelsAndConsonents {

    public static String toLowerCase(String str) {
        String result="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<'Z')
			{

				result+=(char)(str.charAt(i)+32);
			}
			result=result+str.charAt(i);
		}
		return result;
    }

    public static String checkCharacter(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

  public static int[] countVowel(String str) {
        int[] arr = {0, 0}; // Array to store vowel and consonant counts
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String charType = checkCharacter(ch); 

            if (charType.equals("Vowel")) {
                vowel++;
            } else if (charType.equals("Consonant")) {
                consonant++;
            }
        }

        arr[0] = vowel;
        arr[1] = consonant;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        int[] counts = countVowel(inputString);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
}