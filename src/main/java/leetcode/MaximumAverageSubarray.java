package leetcode;


/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 *
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 * Any answer with a calculation error less than 10-5 will be accepted.
 */
public class MaximumAverageSubarray {

    public static void main(String[] args) {

//        int[] nums = {1,12,-5,-6,50,3};
//        int k = 4;

//        int[] nums = {5};
//        int k = 1;
        int[] nums = {3,3,4,3,0};
        int k = 3;

        System.out.println(findBestSubarray(nums, k));


    }

    public static double findBestSubarray(int[] nums, int k) {

        double sum = 0;
        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;
        // Slide the window from the (k+1)th element to the end of the array
        for (int i = k; i < nums.length; i++) {

            sum += nums[i] - nums[i - k]; // Add the new element and subtract the element that is no longer in the window

            maxSum = Math.max(maxSum, sum); // Update maxSum if the current sum is greater
        }

        return maxSum / k; // Return the maximum average, not sum
    }
}
