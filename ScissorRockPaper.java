
package scissorrockpaper;

import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
       int a = r.nextInt(3);
        System.out.println("Scissor(0)  rock(1)   paper(2)");
        int user = input.nextInt();
        System.out.println((user==a)?"draw":"");
        System.out.println((user ==0 && a== 2 )?"you are win":"");
        System.out.println((user == 2 && a == 1)?"you are win":"");
        System.out.println((user == 1 && a == 0)?"you are win ":"");
         System.out.println((a ==0 && user== 2 )?"computer win":"");
        System.out.println((a == 2 && user == 1)?"computer win":"");
        System.out.println((a == 1 && user == 0)?"coputer win ":"");
    }
    
}
