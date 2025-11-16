
package convertfeetintometter;

import java.util.Scanner;

public class ConvertFeetInToMetter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the feet ");
        int F = input.nextInt();
       double metter = F/0.305;
        System.out.println("the metter value is = " +metter);
        

    }
    
}
