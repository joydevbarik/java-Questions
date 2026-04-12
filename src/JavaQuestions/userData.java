//To print the user data.. and it print what an user wants to print in the char, int, double values.
import java.util.*;
public class userData {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int a,b;
       double x,y;
       char ch1,ch2;
       System.out.println("Enter the value of 2 interger, 2 decimal and 2 characters");
       System.out.println("Enter the value of 2 integers\n");
       a = input.nextInt();
       b = input.nextInt();
       System.out.println("Enter the value of 2 doubles\n");
       x = input.nextDouble();
       y = input.nextDouble();
       System.out.println("Enter the value of 2 characters\n");
       ch1 = input.next().charAt(0);
       ch2 = input.next().charAt(0);

       System.out.println("2 interger are"+a+" "+b);
       System.out.println(" 2 decimals are"+x+ " "+y);
       System.out.println("2 characters are:"+ch1+" "+ch2);
   }
}
