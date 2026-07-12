public class MergeArrays {

    static void merge(int[] a, int[] b) {

        int[] ans = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j])
                ans[k++] = a[i++];
            else
                ans[k++] = b[j++];
        }

        while (i < a.length)
            ans[k++] = a[i++];

        while (j < b.length)
            ans[k++] = b[j++];

        for (int x : ans)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {

        int[] a = {1,3,5};
        int[] b = {2,4,6};

        merge(a, b);
    }
}