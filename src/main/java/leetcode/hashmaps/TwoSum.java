package leetcode.hashmaps;


import java.util.HashMap;
import java.util.Map;

/**
 *  Two Sum
 *
 * Given an array of integers nums and an integer target, return indices of two numbers such that they add up to target.
 * You cannot use the same index twice.
 */
public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2,4,6,8,12};
        int target = 20;

        int[] result = findTwoSumForceBrute(nums, target);
        if (result != null) {
            System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found!");
        }

        int[] resultHashMap = findTwoSumWithHashMap(nums, target);
        if (resultHashMap != null) {
            System.out.println("Pair found at indices: " + resultHashMap[0] + " and " + resultHashMap[1]);
        } else {
            System.out.println("No pair found!");
        }

    }

    //Force brute solution
    private static int[] findTwoSumForceBrute(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Pair with given sum " + target + " is (" + nums[i] + ", " + nums[j] + ")");
                    return new int[]{i, j}; // returning indices of found pairs
                }
            }

        }
        return null;
    }

    // Solution with HashMap resulting in O(1) time complexity
    private static int[] findTwoSumWithHashMap(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (resultMap.containsKey(complement)) { // This operation is O(1)
                return new int[] {resultMap.get(complement), i};
            }
            resultMap.put(num, i);
        }
        return new int[] {-1, -1};
    }
}
