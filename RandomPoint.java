
package randompoint;


public class RandomPoint {

    public static void main(String[] args) {
      int x = (int)(Math.random()*100)-50;
      int y = (int)(Math.random()*200)-100;
        System.out.println("("+x+","+y+")");
    }
    
}
