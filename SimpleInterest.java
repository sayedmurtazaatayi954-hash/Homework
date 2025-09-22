
package simpleinterest;

import java.util.Scanner;


public class SimpleInterest {

    public static void main(String[] args) {
        //This program will calculalting the simple interest
        
       
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give the principal:");
        double p = input.nextDouble() ;
        System.out.println("Give the rate :");
        double r = input.nextDouble();
        System.out.println("Give the time :");
        double t = input.nextDouble();
        
        double SI;
        SI= (p*r*t)/100;
        System.out.println("your simple interest is :" + SI);
        
        
    }
    
}
