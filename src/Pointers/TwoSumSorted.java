public class TwoSumSorted {

    static void findPair(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                return;
            }

            if (sum < target)
                left++;
            else
                right--;
        }

        System.out.println("No Pair");
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,8,9};

        findPair(arr,10);
    }
}