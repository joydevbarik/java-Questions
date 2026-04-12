//wap to find out (a+b)^2
import java.util.*;
public class squareQuestion {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       double n,b,r;
       System.out.println("Enter the value of n:");
       n = input.nextDouble();
       System.out.println("Enter the value of b:");
       b = input.nextDouble();
       r = Math.pow(n,2)+Math.pow(b,2)+2*n*b;
       System.out.println("Result is"+r);
   }
}