
package acceleration;

import java.util.Scanner;

public class Acceleration {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the v0");
        double v0 = input.nextInt();
        System.out.println("enter the v1");
        double v1 = input.nextInt();
        double a = (v1-v0)/2;
        System.out.println("the acceleration of these velocity is = "+ a);
    }
    
}
