//Q. accept number from user and calculate the sum and product

import java.util.*;
public class Question4 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int a,b,c,s,p;
       System.out.println("Enter the value of a:");
       a = input.nextInt();
       System.out.println("Enter the value of b:");
       b = input.nextInt();
       System.out.println("Enter the value of c:");
       c = input.nextInt();

       s = a+b+c;
       p = a*b*c;

       System.out.println("The sum value of 3 digits is:"+s);
       System.out.println("The product value of 3 digits is:"+p);
   }
}