
import java.util.Scanner;

public class ReverseTowNumbers{
    public static void main(String[] args ){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Give the first number :");
            int num1 = input.nextInt();
            
            
            int rev1 = reverseNumber(num1);
            
            System.out.println("Reverse of first number = "+ rev1);
            
        }
        
        
    }
    public static int reverseNumber(int n){
        int rev = 0;
        while (n!=0){
            int digit = n % 10;
            rev=rev*10 + digit;
            n/=10;
        }
        return rev;
        
        }
    }