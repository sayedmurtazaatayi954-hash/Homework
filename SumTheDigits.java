
package sumthedigits;

import java.util.Scanner;

public class SumTheDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a 3 digits number");
        int n = input.nextInt();
        int n1 = n%100;
        int d1 = n/100;
        int d2 =n1%10;
        int d3 = n1/10;
        int sum = d1+d2+d3;
        System.out.println(" the sum of this number is "+ sum);
    }
    
}
