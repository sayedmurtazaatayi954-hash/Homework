
package javahomework;

import java.util.Scanner;

public class JavaHomeWork {

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Please give the dollars as decimal:");
        double dollars = input.nextDouble();
        long totalcents =  (long) (dollars *100);
        long totaldollars = totalcents / 100;
        long remaincentsD = totalcents%100;
        long totalnickles = remaincentsD / 75;
        long remaincentsN = remaincentsD%75;
        long totalquarters =remaincentsN/25;
        long remaincentsQ = remaincentsN%25;
        long totaldimes = remaincentsQ/10;
        long remaincentsDI = remaincentsQ % 10;
        long totalpennies = remaincentsDI;
        System.out.println("your total Amount is equal to " + totaldollars+"= Dollars "+totalnickles+"= Nickles "+totalquarters+"= Qurarters "+totaldimes+"= Dimes "+totalpennies+"= Pennies");
        
    }
    
}
