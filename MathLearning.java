
package mathlearning;

import java.util.Scanner;

public class MathLearning {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        int result= a-b;
            System.out.println("what is the answer for this question"+ a +"-" +b);
            int user = input.nextInt();
            if (user == result){
                System.out.println("your answer is correct");
              break;  
            }
            if(user != result){
                System.out.println("sorry your answer is incorrect");
                
                
            }
            
        }

    }
    
}
