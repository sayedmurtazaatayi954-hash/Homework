
package leapyear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        //This program will show is a year be leap of not.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year : ");
        double year = input.nextDouble();
        if ( year % 4==0&&year%100!=0 || year %400==0){
            System.out.println("This year is  a leap year.");
        }
        else{
            System.out.println("This is not a leap year.");
        }
    }
    
}
