//wap to accept two number from user and then calculate the roundup and rounddown value
import java.util.*;
public class roundValues {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double n,ru,rd;
       System.out.println("Enter the value of n:");
       n = input.nextDouble();
       ru = Math.ceil(n);
       rd = Math.floor(n);
       System.out.println("The round up value is:"+ru);
       System.out.println("The round down value is"+rd);
   }
}