
package guessingnumbers;

import java.util.Scanner;


public class GuessingNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random()*100);
        System.out.println("Enter a number between 1 and 100");
        int user = input.nextInt();
        while(true){
            if(user==random){
                System.out.println("you are  correct");
                break;
            }
            else if (user != random && user > random){
                System.out.println("you are  not correct try again your number is very high");
                user = input.nextInt();
            }
            else if ( user !=random && user < random){
                System.out.println("you are not correct try again your number is very low");
                user = input.nextInt();
            }
        }
    
    }
    
}
