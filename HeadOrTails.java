
package headortails;

import java.util.Random;
import java.util.Scanner;

public class HeadOrTails {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         Random rand = new Random();
        System.out.println("Head or tials 0 for talis and 1 for head");
        int user = input.nextInt();
       
        int n = rand.nextInt(2);
        System.out.println(n);
        if (user==n){
            System.out.println("your correct");
        }
        else{
            System.out.println("your not correct");
        }
        

    }
}
