public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int max = nums[0];
        int sum = 0;

        for (int num : nums) {

            sum += num;

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(nums));
    }
}