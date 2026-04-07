import java.util.*;

public class ArithmeticDSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        // EVEN / ODD
        if (n % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        // QUOTIENT & REMAINDER (divide by 5)
        int q = n / 5;
        int r = n % 5;
        System.out.println("Quotient (n/5): " + q);
        System.out.println("Remainder (n%5): " + r);

        // SUM OF DIGITS
        int temp = n, sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);

        // REVERSE NUMBER
        temp = n;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reverse: " + rev);

        // PALINDROME CHECK
        if (n == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome");

        // FACTORIAL
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);

        // PRIME CHECK
        boolean isPrime = true;
        if (n <= 1) isPrime = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}