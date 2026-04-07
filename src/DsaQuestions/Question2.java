//Q. Wap to accept working duty hour and minute of 2 employee from user nd calculate the total working hour

import java.util.*;
public class Question2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h1,h2,m1,m2,tm,th;
        System.out.println("Enter the hour and minute of 2 employee");
        h1 = input.nextInt();
        h2 = input.nextInt();
        m1 = input.nextInt();
        m2 = input.nextInt();
        th = h1+h2;
        tm = m1+m2;
        th = th+tm/60;
        tm = tm%60;
        System.out.println("tota; hour"+th);
        System.out.println("total minute"+tm);
    }
}
