
package hexdigit2dec;

import java.util.Scanner;

public class HexDigit2Dec {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the hexa digit");
        String HD = input.nextLine();
        if (HD.length()!=1){
            System.out.println("you must enter exactly one character");
            System.exit(1);}
            char ch = Character.toUpperCase((HD.charAt(0)));
            if ( 'A'<= ch && ch <='F'){
                int value = ch - 'A'+10;
                System.out.println("The decimal value from hexadigites is "+ch+"is"+value);
            }
            else if ( Character.isDigit(ch)){
                System.out.println("The decimal value for hexadigites is "+ch+"is"+ch);
            }
            else {
                System.out.println(ch+"is an invalid input");
            }
        }
    }
    
}
