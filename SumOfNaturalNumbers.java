
package sumofnaturalnumbers;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        System.out.println("Give a natural number : ");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double N;
        N =(n*(n+1))/2;
        System.out.println("The sum of natural numbers is :" + N);
        
    }

    
}
