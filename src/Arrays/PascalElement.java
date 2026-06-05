public class PascalElement {

    static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int row = 4;
        int col = 2;

        int ans = factorial(row)
                / (factorial(col) * factorial(row - col));

        System.out.println(ans);
    }
}