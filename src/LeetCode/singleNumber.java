import java.util.Scanner;

public class singleNumber {

    public static int[] singleNumber(int[] nums) {
        int xor = 0;

        for (int n : nums)
            xor ^= n;

        int bit = xor & -xor;
        int x = 0;

        for (int n : nums)
            if ((n & bit) != 0)
                x ^= n;

        return new int[]{x, xor ^ x};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int[] ans = singleNumber(nums);

        System.out.println(ans[0] + " " + ans[1]);

        sc.close();
    }
}