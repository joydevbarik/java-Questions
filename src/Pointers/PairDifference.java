public class PairDifference {

    public static void main(String[] args) {

        int[] arr = {1,3,5,8,10};

        int diff = 2;

        int i = 0, j = 1;

        while (j < arr.length) {

            int d = arr[j] - arr[i];

            if (d == diff) {
                System.out.println(arr[i] + " " + arr[j]);
                break;
            }

            if (d < diff)
                j++;
            else
                i++;
        }
    }
}