import java.util.*;

public class MaximumElements {

    public static int maximum(int[] nums) {

        int max = nums[0];

        for (int num : nums) {

            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(maximum(nums));
    }
}