import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number of this day" + 
		                    "for sunday = 0" + 
		                    "for monday = 1" + 
		                    "for thusday = 2" + 
		                    "for wednsday = 3" + 
		                    "for thursday = 4" + 
		                    "for friday = 5" + 
		                    "for satarday = 6");
		                    int d = sc.nextInt();
		                     System.out.println("Enter the future day from today");
		                     int total = sc.nextInt();
		                     int f = total%7;
		                    if (d==0){
		                        switch(f){
		                            case 0:
		                             System.out.println("today is sunday and the future day is  sunday");break;
		                             case 1:
		                             System.out.println("today is sunday and the future day is  monday");break;                                     case 2:
		                             System.out.println("today is sunday and the future day is  thusday");break;                                      case 3:
		                             System.out.println("today is sunday and the future day is  wednsday");break;
		           case 4:
		           System.out.println("today is sunday and the future day is  thursday");break;
		           case 5:
		           System.out.println("today is sunday and the future day is  friday");break;
		           case 6:
		           System.out.println("today is sunday and the future day is  satarday");break;
		                        }
		                    }
		                    else if (d ==1){
		                                switch(f){
		                            case 0:
		                             System.out.println("today is monday and the future day is  sunday");break;
		                             case 1:
		                             System.out.println("today is monday and the future day is  monday");break;                                     case 2:
		                             System.out.println("today is monday and the future day is  thusday");break;                                      case 3:
		                             System.out.println("today is monday and the future day is  wednsday");break;
		           case 4:
		           System.out.println("today is monday and the future day is  thursday");break;
		           case 5:
		           System.out.println("today is monday and the future day is  friday");break;
		           case 6:
		           System.out.println("today is monday and the future day is  satarday");break;
		                        }
		                    }
		                      else if (d ==2){
		                                switch(f){
		                            case 0:
		                             System.out.println("today is thusday and the future day is  sunday");break;
		                             case 1:
		                             System.out.println("today is thusday and the future day is  monday");break;                                     case 2:
		                             System.out.println("today is thusday and the future day is  thusday");break;                                      case 3:
		                             System.out.println("today is thusday and the future day is  wednsday");break;
		           case 4:
		           System.out.println("today is thusday and the future day is  thursday");break;
		           case 5:
		           System.out.println("today is thusday and the future day is  friday");break;
		           case 6:
		           System.out.println("today is thusday and the future day is  satarday");break;
		                        }
		                    }
		                    else if (d ==3){
		                                switch(f){
		                            case 0:
		                             System.out.println("today is wednsday and the future day is  sunday");break;
		                             case 1:
		                             System.out.println("today is wednsday and the future day is  monday");break;                                     case 2:
		                             System.out.println("today is wednsday and the future day is  thusday");break;                                      case 3:
		                             System.out.println("today is wednsday and the future day is  wednsday");break;
		           case 4:
		           System.out.println("today is wednsday and the future day is  thursday");break;
		           case 5:
		           System.out.println("today is wednsday and the future day is  friday");break;
		           case 6:
		           System.out.println("today is wednsday and the future day is  satarday");break;
		                        }
		                    }
		                    else if (d ==4){
		                                switch(f){
		                            case 0:
		                             System.out.println("today is thursday and the future day is  sunday");break;
		                             case 1:
		                             System.out.println("today is thursday and the future day is  monday");break;                                     case 2:
		                             System.out.println("today is thursday and the future day is  thusday");break;                                      case 3:
		                             System.out.println("today is thursday and the future day is  wednsday");break;
		           case 4:
		           System.out.println("today is thursday and the future day is  thursday");break;
		           case 5:
		           System.out.println("today is thursday and the future day is  friday");break;
		           case 6:
		           System.out.println("today is thursday and the future day is  satarday");break;
		                        }
		                    }
		                    else if (d ==5){
		                                switch(f){
		                            case 0:
		                             System.out.println("today is friday and the future day is  sunday");break;
		                             case 1:
		                             System.out.println("today is friday and the future day is  monday");break;                                     case 2:
		                             System.out.println("today is friday and the future day is  thusday");break;                                      case 3:
		                             System.out.println("today is friday and the future day is  wednsday");break;
		           case 4:
		           System.out.println("today is friday and the future day is  thursday");break;
		           case 5:
		           System.out.println("today is friday and the future day is  friday");break;
		           case 6:
		           System.out.println("today is friday and the future day is  satarday");break;
		                        }
		                    }
		                         else if (d ==6){
		                                switch(f){
		                            case 0:
		                             System.out.println("today is satarday and the future day is  sunday");break;
		                             case 1:
		                             System.out.println("today is satarday and the future day is  monday");break;                                     case 2:
		                             System.out.println("today is satarday and the future day is  thusday");break;                                      case 3:
		                             System.out.println("today is satarday and the future day is  wednsday");break;
		           case 4:
		           System.out.println("today is satarday and the future day is  thursday");break;
		           case 5:
		           System.out.println("today is satarday and the future day is  friday");break;
		           case 6:
		           System.out.println("today is satarday and the future day is  satarday");break;
		                        }
		                    }    
		                             
	}
}