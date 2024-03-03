package leetcode;

/**
 * Given an integer array nums and an integer k, find the sum of the subarray with the largest sum whose length is k.
 */
public class SlidingWindow4 {

    public static void main(String[] args) {

        int[] arr = {3, -1, 4, 12, -8, 5, 6};

        int k = 4;
        System.out.println(findBestSubarray(arr, k));
    }

    /**
     * we can build a window of length k and then slide it along the array. Add and remove one element at a time to make
     * sure the window stays size k. If we are adding the value at i, then we need to remove the value at i - k.
     * After we build the first window we initialize our answer to curr to consider the first window's sum.
     */
    public static int findBestSubarray(int[] nums, int k) {

        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        int ans = curr;
        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i - k];

            ans = Math.max(ans, curr);
        }

        return ans;
    }
}
