import java.util.Scanner;


public class ReverseaString {
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter an String");
		String str= input.nextLine();
		
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }
}
