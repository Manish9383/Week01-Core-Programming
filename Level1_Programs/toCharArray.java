import java.util.Scanner;

public class toCharArray {

    // Method which returns a character array from a string
    public static char[] wordsFromTheSting(String word) {
        char[] words = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            words[i] = word.charAt(i);
        }
        return words;
    }

    // Method which compares two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Taking user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.next();

        // Using user-defined
        char[] userDefinedChars = wordsFromTheSting(userInput);

        // Using toCharArray()
        char[] builtInChars = userInput.toCharArray();

    //Comparing both arrays
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        //printing the results
        System.out.println("words using user-defined method: " + new String(userDefinedChars));
        System.out.println("words using toCharArray(): " + new String(builtInChars));
        System.out.println("Are both arrays equal? " + areEqual);
    }
}
