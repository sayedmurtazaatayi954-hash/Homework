
package maximumoftwonumbers;

import java.util.Scanner;

public class MaximumOfTwoNumbers {

    public static void main(String[] args) {
        
        
       Scanner input = new Scanner(System.in);
       System.out.println("Give the x value:");
       double x = input.nextDouble();
       System.out.println("Give the y value");
       double y = input.nextDouble();
        if(x>y) {
            System.out.println("its x>y");
            
        }
        if (x<y) {
            System.out.println("its x<y");
            
        }
    }
}   
