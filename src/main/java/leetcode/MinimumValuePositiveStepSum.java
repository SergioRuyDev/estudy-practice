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

        // Start with startValue = 1.
        int startValue = 1;

        // While we haven't found the first valid startValue
        while (true) {
            // The step-by-step total equals startValue at the beginning.
            // Use boolean parameter "isValid" to record whether the total
            // is larger than or equal to 1.
            int total = startValue;
            boolean isValid = true;

            // Iterate over the array "nums".
            for (int num : nums) {
                // In each iteration, calculate "total"
                // plus the element "num" in the array.
                total += num;

                // If "total" is less than 1, we shall try a larger startValue,
                // we mark "isValid" as "false" and break the current iteration.
                if (total < 1) {
                    isValid = false;
                    break;
                }
            }

            // If "isValid" is true, meaning "total" is never less than 1 in the
            // iteration, therefore we return this "startValue". Otherwise, we
            // go ahead and try "startValue" + 1 as the new "startValue".
            if (isValid) {
                return startValue;
            } else {
                startValue += 1;
            }
        }
    }
    /**
     * Complexity Analysis
     *
     * Let nnn be the length of the array nums and mmm be the absolute value of the lower bound of elements in nums.
     * Time complexity: O(n2⋅m)O(n^2 \cdot m)O(n2⋅m)
     * Imagine the case when every element in the first half of nums is 1 and every element in the second half of nums is
     * −m-m−m, that is nums=[1,1,1,1,...,−m,−m,−m]nums = [1,1,1,1,...,-m,-m,-m]nums=[1,1,1,1,...,−m,−m,−m].
     * In this case, the minimum valid startValue is (n/2)⋅(m−1)+1(n/2)\cdot(m-1) + 1(n/2)⋅(m−1)+1, the same number of
     * times we will do the iteration.
     * Every iteration, we will start with startValue, and we must update the step-by-step total at least (n/2)+1(n/2) + 1(n/2)+1 times.
     * Therefore, for large enough values of mmm and nnn, we will have time complexity equals: O(n2⋅m)O(n^2 \cdot m)O(n2⋅m)
     * Space complexity: O(1)O(1)O(1)
     * For each loop, we only need the current total and a flag to determine if it was ever smaller than 1, which only
     * costs constant space.
     */
}


