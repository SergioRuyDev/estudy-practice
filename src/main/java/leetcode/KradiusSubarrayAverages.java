package leetcode;

import java.util.Arrays;

/**
 * You are given a 0-indexed array nums of n integers, and an integer k.
 *
 * The k-radius average for a subarray of nums centered at some index i with the radius k is the average of all elements
 * in nums between the indices i - k and i + k (inclusive). If there are less than k elements before or after the index i,
 * then the k-radius average is -1.
 *
 * Build and return an array avgs of length n where avgs[i] is the k-radius average for the subarray centered at index i.
 *
 * The average of x elements is the sum of the x elements divided by x, using integer division. The integer division truncates
 * toward zero, which means losing its fractional part.
 * To solve this problem in Java, we'll iterate over the nums array and calculate the k-radius average for each element,
 * adhering to the specified conditions. We'll use a sliding window approach to efficiently calculate the sum of elements
 * in the radius of k around the current index i. Here's how we can implement it:
 *
 * Initialize an array avgs of the same length as nums to store the k-radius averages.
 * For each index i in nums, check if it's possible to have a k-radius subarray centered at i (i.e., check if i - k >= 0
 * and i + k < nums.length). If not, set avgs[i] to -1.
 * If a k-radius subarray is possible, calculate its sum and then its average using integer division, and assign this value to avgs[i].
 * To optimize the sum calculation, use a sliding window technique where you add the next element and subtract the element
 * that's no longer in the window as you move the center of the window from left to right.
 */
public class KradiusSubarrayAverages {
    public static void main(String[] args) {

        int[] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        System.out.println(Arrays.toString(getAverages(nums,k)));
    }

    public static int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];

        // Edge case: k = 0, each element is its own average
        if (k == 0) {
            return nums;
        }

        // Initialize sum and count for the first window
        long sum = 0;
        int count = 0;
        for (int i = 0; i < n && i <= k * 2; i++) {
            sum += nums[i];
            count++;
        }

        for (int i = 0; i < n; i++) {
            // Check if a valid k-radius subarray can be centered at i
            if (i - k < 0 || i + k >= n) {
                avgs[i] = -1;
            } else {
                // Calculate the average using integer division
                avgs[i] = (int)(sum / count);

                // Update sum and count for the next window, if possible
                if (i + k + 1 < n) {
                    sum += nums[i + k + 1];
                }
                if (i - k >= 0) {
                    sum -= nums[i - k];
                }
            }
        }

        return avgs;
    }
}
