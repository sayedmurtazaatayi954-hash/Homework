package countingcirclearea;

import java.util.Scanner;



public class CountingCircleArea {
    public static void main(String[] args){
        // This program will calculate the area of circle
        System.out.println("Give the radius");
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        double A;
        A = 3.14*R*R;
        System.out.println("The area of this circle is : " +A+ " unite");
    
    }
} 