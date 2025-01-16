import java.util.Scanner;

public class VowelConsonantFinder {

    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32); // Convert uppercase to lowercase
        }
        return ch; 
    }

    public static String checkCharacter(char ch) {
        ch = toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] findVowelConsonants(String str) {
        String[][] results = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            results[i][0] = String.valueOf(str.charAt(i)); 
            results[i][1] = checkCharacter(str.charAt(i));
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("Character\tType");
        for (String[] row : results) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String[][] results = findVowelConsonants(inputString);
        displayResults(results);
    }
}