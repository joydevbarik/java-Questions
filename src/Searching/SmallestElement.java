public class SmallestElement {

    public static void main(String[] args) {

        int[] arr = {12, 45, 67, 23, 89};

        int min = arr[0];

        for (int num : arr) {

            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
    }
}