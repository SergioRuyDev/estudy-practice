package leetcode;

/**
 * Given an integer array nums, find the number of ways to split the array into two parts so that the first section has
 * a sum greater than or equal to the sum of the second section. The second section should have at least one number.
 */
public class PrefixSum2 {
    public static void main(String[] args) {

        int[] nums = {10, 4, -8, 7};

        int result = waysToSplitArray(nums);
        System.out.println(result);

    }

    public static int waysToSplitArray(int[] nums) {
        int n = nums.length;

        long[] prefix = new long[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            long leftSection = prefix[i];
            long rightSection = prefix[n - 1] - prefix[i];
            if (leftSection >= rightSection) {
                ans++;
            }
        }

        return ans;
    }
}


