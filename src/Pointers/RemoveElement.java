public class RemoveElement {

    static int remove(int[] arr, int val) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != val)
                arr[j++] = arr[i];
        }

        return j;
    }

    public static void main(String[] args) {

        int[] arr = {3,2,2,3};

        int len = remove(arr, 3);

        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
    }
}