import java.util.Scanner;

class palin{
    public boolean checker(String str)
    {
        String st="";
        for (int i=str.length()-1;i>=0;i--)
        {
            st+=str.charAt(i);
        }
        if(st.equals(str))
        {
            return true;
        }
        return false;
    }
    void display(String str)
    {
        System.out.println("Is given String is Palindrome?: "+checker(str));

    }
}
public class Palindrome{
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Enter an String :");
        String st=input.nextLine();
        palin p= new palin();
        p.checker(st);
        p.display(st);
    }
}