////To print the user data
//import java.util.*;
//public class Arithmatic {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int a,b;
//        double x,y;
//        char ch1,ch2;
//        System.out.println("Enter the value of 2 interger, 2 decimal and 2 characters");
//        System.out.println("Enter the value of 2 integers\n");
//        a = input.nextInt();
//        b = input.nextInt();
//        System.out.println("Enter the value of 2 doubles\n");
//        x = input.nextDouble();
//        y = input.nextDouble();
//        System.out.println("Enter the value of 2 characters\n");
//        ch1 = input.next().charAt(0);
//        ch2 = input.next().charAt(0);
//
//        System.out.println("2 interger are"+a+" "+b);
//        System.out.println(" 2 decimals are"+x+ " "+y);
//        System.out.println("2 characters are:"+ch1+" "+ch2);
//    }
//}
//

////To calculate the user data like calculator
//import java.util.*;
//public class Arithmatic {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int a,b,s;
//        System.out.println("Enter the value of 2 numbers");
//        a = input.nextInt();
//        b = input.nextInt();
//        s = a+b;
//        System.out.println("The sum value of two digits are:"+s);
//    }
//}

////accept number from user and calculate the sum and product
//import java.util.*;
//public class Arithmatic {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int a,b,c,s,p;
//        System.out.println("Enter the value of a:");
//        a = input.nextInt();
//        System.out.println("Enter the value of b:");
//        b = input.nextInt();
//        System.out.println("Enter the value of c:");
//        c = input.nextInt();
//
//        s = a+b+c;
//        p = a*b*c;
//
//        System.out.println("The sum value of 3 digits is:"+s);
//        System.out.println("The product value of 3 digits is:"+p);
//    }
//}

////wap to accept 5 numbers from user and calculate the average
//import java.util.*;
//public class Arithmatic {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to average machine");
//
//        double a,b,c,d,e,avg;
//        System.out.println("Enter the value of a:");
//        a = input.nextDouble();
//        System.out.println("Enter the value of b:");
//        b = input.nextDouble();
//        System.out.println("Enter the value of c:");
//        c = input.nextDouble();
//        System.out.println("Enter the value of d:");
//        d = input.nextDouble();
//        System.out.println("Enter the value of e:");
//        e = input.nextDouble();
//
//        avg = (a+b+c+d+e)/5;
//        System.out.println("Average is"+avg);
//    }
//}

////wap to meter from user snd convert it into kilometer
//import java.util.*;
//public class Arithmatic {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        double m,km;
//        System.out.println("Enter the value of meter:");
//        m = input.nextDouble();
//        km = m/1000;
//        System.out.println("The kilometer value is "+km);
//    }
//}

////wap to accept km from user and convert it into meter and cm
//import java.util.*;
//public class Arithmatic {
//    public static void main(String[]args){
//        Scanner input = new Scanner(System.in);
//        long km,m,cm;
//        System.out.println("Enter the value of km:");
//        km = input.nextLong();
//        m = km*1000;
//        cm = m*100;
//        System.out.println("The meter value is"+m);
//        System.out.println("The centimeter value is"+cm);
//    }
//}

// //wap to accept salary from user and calculate income tax 20% of salary
// import java.util.*;
// public class Arithmatic {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

//        double sal,it;
//        System.out.println("Enter the salary:");
//        sal = input.nextDouble();
//        it = sal*20/100;
//        System.out.println("It is"+it);
//    }
// }

//wap to accept working duty hour and minute of 2 employee from user nd calculate the total working hour
import java.util.*;
public class Arithmatic {
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



