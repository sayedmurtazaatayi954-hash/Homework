
package greatestcommondivisor;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first numbers that you want to it's common  divisor");
         int n1 = input.nextInt();
         System.out.println("enter the second number that you wnat it's common divisor");
            int n2 = input.nextInt();
            int gcd=1;
            int k =2;
        while(k <= n1 && k <= n2){           
            if (n1 % k == 0&& n2 % k== 0 )
                gcd = k;
                k++;
              
       
        }
          System.out.println("the GCD of these numbers is "+ gcd);
    }
}

