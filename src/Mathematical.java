
//
////wap to accept two number from user and calculate the min and max values
//import java.util.*;
//public class Mathematical {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n1,n2,min,max;
//        System.out.println("Enter the value of n1:");
//        n1 = input.nextInt();
//        System.out.println("Enter the value of n2:");
//        n2 = input.nextInt();
//        max = Math.max(n1,n2);
//        min = Math.min(n1,n2);
//        System.out.println("The maximum value is"+max);
//        System.out.println("The minimum value is"+min);
//    }
//}

//Math.floor for rounddown value
//Math.ceil for roundup value
////wap to accept two number from user and then calculate the roundup and rounddown value
//import java.util.*;
//public class Mathematical {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double n,ru,rd;
//        System.out.println("Enter the value of n:");
//        n = input.nextDouble();
//        ru = Math.ceil(n);
//        rd = Math.floor(n);
//        System.out.println("The round up value is:"+ru);
//        System.out.println("The round down value is"+rd);
//    }
//}

//Math.abs() is for converting negative to positive number
////wap to accept negative number from user and convert it into positive
//import java.util.*;
//public class Mathematical {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n,pos;
//        System.out.println("Enter the value of n:");
//        n = input.nextInt();
//        pos = Math.abs(n);
//        System.out.println("The positive value is:"+pos);
//    }
//}

////wap to find out (a+b)^2
//import java.util.*;
//public class Mathematical {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        double n,b,r;
//        System.out.println("Enter the value of n:");
//        n = input.nextDouble();
//        System.out.println("Enter the value of b:");
//        b = input.nextDouble();
//        r = Math.pow(n,2)+Math.pow(b,2)+2*n*b;
//        System.out.println("Result is"+r);
//    }
//}
//
//((a+b)^2)^3
//import java.util.*;
//public class Mathematical {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double a,b,r;
//        System.out.println("Enter the value of a");
//        a = input.nextDouble();
//        System.out.println("Enter the value of b");
//        b = input.nextDouble();
//        r = Math.pow(Math.pow(a+b,2),3);
//        System.out.println("The value of r is"+r);
//    }
//}

//public class Mathematical {
//    public static void main(String[] args) {
//        int a=5, b=4,r;
//        r = (int) Math.pow(Math.pow(a+b,2),3);
//        System.out.println("The value of r is"+r);
//    }
//}

//wap to accept length and breadth of a rectangle from user and calculate diagonal of a rectangle
import java.util.*;
public class Mathematical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l,b,d;
        System.out.println("Enter the value of length:");
        l = input.nextDouble();
        System.out.println("Enter the value of breadth:");
        b = input.nextDouble();
        d = Math.sqrt(Math.pow(l,2)+Math.pow(b,2));
        System.out.println("The value of diagonal is:-"+d);
    }
}