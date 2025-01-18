
import java.util.Scanner;
public class Compare {
   
	
	public static String[] lexi1(String str, String str2) {
		String [] result = {str,str2};
		int n=0;
		if(str.length()<str2.length()){
			n=str.length();
		}
		else{
			n=str2.length();
		}

		for(int i=0;i<n;i++)
		{
			
			if(str.charAt(i)>str2.charAt(i))
			{
				result[0]=str2;
				result[1]=str;
				break;
			}
			else if(str2.length()==i+1 && str.length()>i)
        {
				
			result[0]=str2;
			result[1]=str;
			break;
			}	
  
		}
		return result;
	}
  
	 public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String :");
        String firstStr = scanner.next();
		
		
		 System.out.println("Enter Second String :");
        String secondStr= scanner.next();
		
		String[] answer= lexi1(firstStr,secondStr);
		
		System.out.println(answer[0]+" comes before "+answer[1]+ " in lexicographical order");
	 }
}
		
		
		


