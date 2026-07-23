public class BreakWhile {

    public static void main(String[] args) {

        int i = 1;

        while (true) {

            if (i == 7)
                break;

            System.out.print(i + " ");

            i++;
        }
    }
}