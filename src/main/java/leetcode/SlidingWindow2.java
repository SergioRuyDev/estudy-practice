package leetcode;

/**
 * You are given a binary string s (a string containing only "0" and "1"). You may choose up to one "0" and flip it to a "1".
 * What is the length of the longest substring achievable that contains only "1"?
 *
 * For example, given s = "1101100111", the answer is 5. If you perform the flip at index 2, the string becomes 1111100111.
 */
public class SlidingWindow2 {
    public static void main(String[] args) {

        String s = "1101100111";
        System.out.println(findLength(s));

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(findMaxOnes(nums, k));
    }

    public static int findLength(String s) {
        // curr is the current number of zeros in the window
        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right)== '0') {
                curr++;
            }

            while (curr > 1) {
                if (s.charAt(left) == '0') {
                    curr--;
                }

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    /**
     * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can
     * flip at most k 0's.
     */
    public static int findMaxOnes(int[] nums, int k) {

        int left = 0; // Start of the window
        int zeros = 0; // Number of zeros in the current window
        int maxOnes = 0; // Maximum number of consecutive 1's

        for (int right = 0; right < nums.length; right++) {
            // If the current element is 0, increase the count of zeros in the window
            if (nums[right] == 0) {
                zeros++;
            }

            // If zeros exceed k, shrink the window from the left until zeros are <= k
            while (zeros > k) {

                if (nums[left] == 0) {
                    zeros--; // If the leftmost element was 0, decrement the count of zeros
                }
                left++; // Shrink the window by incrementing left
            }

            // Update the maximum number of 1's found
            maxOnes = Math.max(maxOnes, right - left + 1);
        }

        return maxOnes;
    }
}
