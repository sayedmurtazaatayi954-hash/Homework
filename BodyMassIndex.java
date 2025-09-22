
package bodymassindex;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
        System.out.println("If your are 16 or older this program will calculate your BMI");
        System.out.println("Please give your total weight in Kg : ");
        double W = input.nextDouble();
        System.out.println("Please give your height in meter : ");
        double H = input.nextDouble();
        double BMI =( W/Math.pow(H, 2) );
        if (BMI<18.5){
            System.out.println("your BMI is = "+(int)BMI+"! you are Underweight.");
        }
        else if (18.5<=BMI || BMI<25.0 ){
            System.out.println("your BMI is = "+(int)BMI+"! you are In Normalweight.");
        }
        else if (25.0<=BMI || BMI>30.0)
            System.out.println("your BMI is = "+(int)BMI+"! you are Overweight.");
        else if (BMI>=30)
            System.out.println("your BMI is = "+(int)BMI+"! you are in Obese.");
    }
    
}
