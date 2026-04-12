//wap to accept two number from user and calculate the min and max values
import java.util.*;
public class minMax{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n1,n2,min,max;
       System.out.println("Enter the value of n1:");
       n1 = input.nextInt();
       System.out.println("Enter the value of n2:");
       n2 = input.nextInt();
       max = Math.max(n1,n2);
       min = Math.min(n1,n2);
       System.out.println("The maximum value is"+max);
       System.out.println("The minimum value is"+min);
   }
}