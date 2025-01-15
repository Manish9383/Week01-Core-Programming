import java.util.*;

public class StringOutOfBoundsException {

    public static void generateException(String text2){
		try{
			
			text2.charAt(text2.length());
			
		}
		catch(StringIndexOutOfBoundsException e){
			handleException(e);
		}
	}
	
	public static void handleException(Exception e){
		System.out.println("Exception Occured : "+e.getMessage());
	}

    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an string");
		String text= input.next();
		generateException(text);
		
		
    }
}