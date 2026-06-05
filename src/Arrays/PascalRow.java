public class PascalRow {

    public static void main(String[] args) {

        int row = 5;

        int num = 1;

        for (int i = 0; i < row; i++) {

            System.out.print(num + " ");

            num = num * (row - 1 - i) / (i + 1);
        }
    }
}