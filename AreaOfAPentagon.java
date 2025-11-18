
package areaofapentagon;

import java.util.Scanner;

public class AreaOfAPentagon {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the length from the center of pentagon");
        double r = input.nextDouble();
        double s = 2*r*(Math.sin(Math.PI)/5);
        double A = (5*(Math.pow(s, 2)))/(4*(Math.tan((Math.PI))/5));
        System.out.println("For this petagon area is = "+A);
    }
    
}
