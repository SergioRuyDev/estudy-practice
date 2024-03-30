package leetcode.hashmaps;

import java.util.*;

/**
 * Anytime you find your algorithm running if ... in ..., then consider using a hash map or set to store elements to
 * have these operations run in O(1). Try these upcoming practice problems with what was learned here.
 */

/**
 * Given an integer array nums, find all the unique numbers x in nums that satisfy the following: x + 1 is not in nums,
 * and x - 1 is not in nums.
 */
public class FindNumbers {
    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 11, 12};

        int[] uniqueArray = findUniqueNumbers(nums);
        System.out.println(Arrays.toString(uniqueArray));

        List<Integer> uniqueNums = findNumbers(nums);
        System.out.println(uniqueNums);
    }

    // force brute
    public static int[] findUniqueNumbers(int[] nums) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : nums) {
            boolean isUnique = true;
            for (int otherNum : nums) {
                if (num == otherNum - 1 || num == otherNum + 1) {
                    isUnique = false;
                    break; // Break out of the inner loop if a neighbor is found
                }
            }
            if (isUnique) {
                uniqueList.add(num); // Add to list if unique
            }
        }

        // Convert ArrayList to array
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
    }

    /**
     * Because the checks are O(1), the time complexity is O(n) since each for loop iteration runs in constant time.
     * The set will occupy O(n) space.
     */
    public static List<Integer> findNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();

        for (int num: nums) {
            numSet.add(num);
        }

        for (int num: nums) {
            if (!numSet.contains(num + 1) && !numSet.contains(num - 1)) {
                ans.add(num);
            }
        }

        return ans;
    }

}


