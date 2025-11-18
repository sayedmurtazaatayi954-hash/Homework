
package findthecharacterofasciicode;

import java.util.Scanner;

public class FindTheCharacterOfASCIICode {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the ASCII Code");
        int user = input.nextInt();
        System.out.println("Here is the Character"+(char)user);
    }
    
}
