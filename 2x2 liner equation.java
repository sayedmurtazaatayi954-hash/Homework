import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the a of liner equation");
		 int a = sc.nextInt();
	System.out.println("Enter the b of liner equation");
	 int b = sc.nextInt();
	System.out.println("Enter the c of liner equation");
	 int  c= sc.nextInt();
	System.out.println("Enter the d of liner equation");
	 int  d= sc.nextInt();
	System.out.println("Enter the e of liner equation");
	 int e = sc.nextInt();
	System.out.println("Enter the f of liner equation");
	 int f = sc.nextInt();
	 double x = (e*d-b*f)/(a*d-c*b);
	 double y = (a*f-e*c)/(a*d-c*b);
	  System.out.println("the value of x = "+x);
	   System.out.println("the value of y = "+ y);	 
	}
	
}