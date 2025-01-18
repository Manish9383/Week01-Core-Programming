import java.util.Scanner;

class Temp{
    double temp;
   Temp(double temp){
     this.temp=temp;
   }
    public double celsius(){
        return (temp - 32) * 5/9;
    }
    public double fahrenheit(){
        return (temp * 9/5) + 32;
    }
}

public class TemperatureDemo{
    public static void main(String args[]){
         Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature:");
        double tempe = input.nextDouble();

        Temp t = new Temp(tempe);
        System.out.println("Temperature in Fahrenheit: " + t.fahrenheit()+"°F");
        System.out.println("Temperature in Celsius: " + t.celsius()+"°C");
    }
}    


