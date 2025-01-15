import java.util.Scanner;

public class StringComparison{
	
		public static boolean stringComp(String str1, String str2)
		{
			
			if(str1.length()==str2.length())
			{
			for(int i=0;i<str1.length();i++)
			{
			 
               if(str1.charAt(i)==str2.charAt(i))
			   {
				   return true;
			   }	
					
				else
				{
					return false;
				}

			  
			}
			}
			return false;	
		}
		
		public static void main(String[] Args)
		{
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter First string ");
		    String text1= input.next();
			
		  System.out.println("Enter Second string ");
		    String text2= input.next();
			
			boolean resultUsingCharAt= stringComp(text1,text2);
			boolean resultUsingEquals= text1.equals(text2);
			
			System.out.println("Result using CharAt(): " +resultUsingCharAt);
			System.out.println("Result using equals(): " +resultUsingEquals);
			
			input.close();
		}
	}
			
			
