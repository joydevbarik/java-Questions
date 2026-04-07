//wap to accept 5 numbers from user and calculate the average
import java.util.*;
public class Question3{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to average machine");

       double a,b,c,d,e,avg;
       System.out.println("Enter the value of a:");
       a = input.nextDouble();
       System.out.println("Enter the value of b:");
       b = input.nextDouble();
       System.out.println("Enter the value of c:");
       c = input.nextDouble();
       System.out.println("Enter the value of d:");
       d = input.nextDouble();
       System.out.println("Enter the value of e:");
       e = input.nextDouble();

       avg = (a+b+c+d+e)/5;
       System.out.println("Average is"+avg);
   }
}