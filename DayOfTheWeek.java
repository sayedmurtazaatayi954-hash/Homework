
package dayoftheweek;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: like 2024");
        int J = input.nextInt();
        int j =J/100;
        System.out.println("Enter the month like 1-12");
        int m = input.nextInt();
        System.out.println("Enter the day of the month like 1-31");
        int q = input.nextInt();
        int k = J%100;
        int h=(q+ (26*(m+1))/10 +k + (k/4) +(j/4) +(5*j))%7;
        switch(h){
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tusday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
                
        }
        
    }
    
}
