
package lottrey;

import java.util.Scanner;


public class Lottrey {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double N1 = Math.random()*10;
    double N2 = Math.random()*10;
        System.out.println("Enter two digit numbers ");
        double Number1 = input.nextDouble();
        double Number2 = input.nextDouble();
        if ((int) N1==(int)Number1 && (int)N2==(int)Number2){
            System.out.println("Your reward is 10,000$");
        }
        else if ((int) N1 == (int)Number2&& (int)N2 ==(int) Number1){
            System.out.println("Your reward is 3,000$");
            
        }
        else if ((int) N1 == (int)Number1 ^ (int)N2 == (int)Number2){
            System.out.println("Your reward is 1,000$");
            
        }
        else if ((int) N1 ==(int) Number2 ^(int) N2 ==(int) Number1){
        System.out.println("Your reward is 1,000$");
            
        }
        else{
            System.out.println("You didn't guess correctly. Thanks!");
        }
    }
    
}
