import java.util.Scanner;

public class ArgumentException{

   
    public static void generateException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

      
        System.out.println("Substring: " + text.substring(5, 3));
    }


    public static void handleException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        try {
            
            System.out.println("Substring: " + text.substring(5, 3));
        } catch (IllegalArgumentException e) {
           
            System.out.println("Caught IllegalArgumentException: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
           
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
       
        System.out.println("Demonstrating IllegalArgumentException:");
        generateException();

        System.out.println("\nHandling IllegalArgumentException:");
      
        handleException();
    }
}
