
package costofdriving;

import java.util.Scanner;

public class CostOfDriving {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the dfiving distance: ");
        double D = input.nextDouble();
        System.out.println("Enter miles per gallon : ");
        double MG = input.nextDouble();
        System.out.println("Enter price per gallon");
        double PG = input.nextDouble();
        double CD = D/MG*PG;
        System.out.println("The cost of driving  is $ "+ CD);
        
    }
    
}
