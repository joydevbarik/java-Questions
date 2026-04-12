
//


//Math.floor for rounddown value
//Math.ceil for roundup value


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


//


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