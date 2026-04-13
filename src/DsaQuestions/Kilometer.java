//wap to meter from user snd convert it into kilometer
import java.util.*;
public class Kilometer{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       double m,km;
       System.out.println("Enter the value of meter:");
       m = input.nextDouble();
       km = m/1000;
       System.out.println("The kilometer value is "+km);
   }
}
