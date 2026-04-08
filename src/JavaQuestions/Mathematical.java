import java.util.*;
public class Mathematical{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double n,sq,sqrt;
       System.out.println("Enter the value of n:");
       n = input.nextDouble();
       sq = Math.pow(n,2);
       sqrt = Math.sqrt(n);

       System.out.println("The value of square is"+sq);
       System.out.println("The value of squareoot is"+sqrt);
   }
}