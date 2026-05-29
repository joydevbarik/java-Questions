import java.util.Scanner;

public class FibonacciLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter terms: ");

        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int temp = a + b;

            a = b;

            b = temp;
        }

        sc.close();
    }
}