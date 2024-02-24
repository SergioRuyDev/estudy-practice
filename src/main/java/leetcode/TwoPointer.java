package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoPointer {

    // Use two pointers technique to solve palindrome problem

    public static void main(String[] args) {

        /*
        Example 1: Given a string s, return true if it is a palindrome, false otherwise.
        A string is a palindrome if it reads the same forward as backward. That means, after reversing it, it is still the same string.
        For example: "abcdcba", or "racecar".
         */

        String palindrome = "racecar";

        System.out.println(checkIfPalindrome(palindrome));

/*
        Example 2: Given a sorted array of unique integers and a target integer, return true if there exists a pair of numbers
        that sum to target, false otherwise.
 */

        int[] nums = new int[]{1, 2, 4, 6, 8, 9, 14, 15};

        System.out.println(checkSumPairs(nums, 13));
        System.out.println(findTwoSum(nums, 13));

    }

    public static boolean checkIfPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean checkSumPairs(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // curr is the current sum
            int curr = nums[left] + nums[right];
            if (curr == target) {
                return true;
            }

            if (curr > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    public static boolean findTwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                return true;

            } else if (sum < target) {
                left++;

            } else {
                right--;
            }
        }
        return false;
    }

    /*
    1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     */

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
