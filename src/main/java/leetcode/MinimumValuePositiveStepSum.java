package leetcode;


/**
 * Given an array of integers nums, you start with an initial positive value startValue.
 *
 * In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
 *
 * Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 */
public class MinimumValuePositiveStepSum {

    public static void main(String[] args) {

        int[] nums = {-3, 2, -3, 4, 2};
        int result = minStartValue(nums);

        System.out.println(result);
    }

    public static int minStartValue(int[] nums) {

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


