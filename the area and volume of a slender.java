import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("please give the radius value");
		double r = sc.nextDouble();
		 System.out.println("please give the hight value");
		 double h = sc.nextDouble();
		 double a = r*r*3.14;
		 double v =a*h;
		  System.out.println("the area is = "+a+"and the volume is = "+v);
			}
			
}