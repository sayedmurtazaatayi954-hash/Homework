import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =(int) (Math.random()*10);
		int b =(int) (Math.random()*10);
			
			 if(a>=b ){
			      System.out.println("what is the correct answer for this equation"+a+"-"+b);
			int resulte = a-b;
			 int user = sc.nextInt();
			 
			if (user==resulte ){
			    
		 System.out.println("your answer is correct.");
		 }
		 else if(user!=resulte){
		      System.out.println("your answer is incorrect");
			}
			} 
		   if(a<b){
		   a=  a+9;
		      System.out.println("what is the correct answer for this equation"+a+"-"+b);
		   int resulte = a-b;
			 int user = sc.nextInt();
		   
			 if (user==resulte ){
			    
		 System.out.println("your answer is correct.");
			 }
		 else  if(user!=resulte){
		      System.out.println("your answer is incorrect");
		 }
	}
}
}