import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {
        String result = ""; 
        boolean[] seen = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!seen[currentChar]) {
				result=result+currentChar;
                seen[currentChar] = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);

        scanner.close();
	}
}
