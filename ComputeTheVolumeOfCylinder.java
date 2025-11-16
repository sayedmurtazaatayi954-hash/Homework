
package computethevolumeofcylinder;

import java.util.Scanner;

public class ComputeTheVolumeOfCylinder {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the value or radius");
        int r = input.nextInt();
        System.out.println("enter the length or cylinder");
        int l = input.nextInt();
        double area = r*r*(Math.PI);
        double volume = area *l;
        System.out.println(" the volume or this cylender is " + volume);
  
    }
    
}
