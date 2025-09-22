
package taxforafghanistan;

import java.util.Scanner;

public class TaxForAfghanistan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please Give your monthly income : ");
        double income = input.nextDouble();
        if(income <= 5000)
            System.out.println("It is not tax for your monthly income.");
        if(income > 5000 && income<=12500){
            double tax1=(income - 5000)/50;
            System.out.println("your tax from this monthly income is : " + (int)tax1);
        }
           if(income > 12500 && income <= 100000){
            double tax1=(12500- 5000)/50;
        
            double tax2=((income - 12500) / 10)+ tax1;
            System.out.println("your tax from this monthly income is : " + (int)tax2);}
            if ( income >100000){
                double tax1 =(12500-5000)/50;
                double tax2 = (100000-125000)/10;
                double tax3 = ((income - 100000)/5)+tax1+tax2;
                System.out.println("your tax for this monthly income is : " + (int) tax3);
            }
        }
           
            
    }
    

