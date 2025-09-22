
import java.util.Scanner;

public class ConvertFarhrenheitToCelsius{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give the Farhrenheit value : ");
        double f = input.nextDouble();
        double c;
        c = (5/9)*f-32;
        System.out.println(" The Celsius value is =" + f);
        
    }
}