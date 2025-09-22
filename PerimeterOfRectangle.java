package perimeterofrectangle;

import java.util.Scanner;

public class PerimeterOfRectangle{
    public static void main(String[] args){
        // This java program will calculating the perimeter of rectangle
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give the width of rectangle :");
        double width = input.nextDouble();
        System.out.println("Giive the lengh of rectangle :");
        double lengh = input.nextDouble();
        double perimeter;
        perimeter = 2*(width+lengh);
        System.out.println("The perimeter of this rectangle is :"+ perimeter);
        
        
    }
}
