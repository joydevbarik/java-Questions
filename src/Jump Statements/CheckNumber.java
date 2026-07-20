public class CheckNumber {

    static void check(int n) {

        if (n < 0)
            return;

        System.out.println("Positive Number");
    }

    public static void main(String[] args) {

        check(-5);
        check(10);
    }
}