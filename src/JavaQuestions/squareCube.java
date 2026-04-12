//((a+b)^2)^3
import java.util.*;
public class squareCube {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double a,b,r;
       System.out.println("Enter the value of a");
       a = input.nextDouble();
       System.out.println("Enter the value of b");
       b = input.nextDouble();
       r = Math.pow(Math.pow(a+b,2),3);
       System.out.println("The value of r is"+r);
   }
}