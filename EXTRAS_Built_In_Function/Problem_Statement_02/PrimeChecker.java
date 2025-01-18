import java.util.Scanner;
class PrimeC{

   public boolean isPrime(int prime )
    {
        for(int i=2;i<=prime/2;i++)
        {
            if(prime%i==0)
            {
                return false;
            }
          
        }
        return true;

    }
    void display(int prime)
    {
     System.out.println("is number :"+prime+" Prime :"+isPrime(prime));
    }
}
public class PrimeChecker{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an number");
        int num=input.nextInt();
        PrimeC p= new PrimeC();
        p.isPrime(num);
        p.display(num);



    }
}