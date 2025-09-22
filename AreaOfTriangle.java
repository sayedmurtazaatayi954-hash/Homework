
package areaoftriangle;

import java.util.Scanner;


public class AreaOfTriangle {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println(" Give the base of tirangle");
        double b = input.nextDouble();
        System.out.println("Give the height");
        double h = input.nextDouble();
        double A;
        A = (b*h)/2;
        System.out.println("The area of this tirngle is = " + A);
        
    }
    
}
