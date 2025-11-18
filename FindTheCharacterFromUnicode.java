
package findthecharacterfromunicode;

import java.util.Scanner;

public class FindTheCharacterFromUnicode {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the Character ");
        char user = input.next().charAt(0);
        System.out.println("here is the unicode of that character"+(int)user);
    }
    
}
