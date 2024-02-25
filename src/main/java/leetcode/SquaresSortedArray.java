package leetcode;

import java.util.Arrays;

public class SquaresSortedArray {

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};
        String s = sortedSquares(nums).toString();
        System.out.println(s);


    }

    /**
     * Time Complexity: O(NlogN), where N is the length of a.
     *
     * Space complexity : O(N) or O(logN)
     *
     * The space complexity of the sorting algorithm depends on the implementation of each program language.
     *
     * For instance, the list.sort() function in Python is implemented with the Timsort algorithm whose space complexity
     * is O(N).
     *
     * In Java, the Arrays.sort() is implemented as a variant of quicksort algorithm whose space complexity is
     * O(logN). However, if the array is highly structured (has few sorted subarrays), then linear space may be used instead.
     */
    public static int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; ++i)
            ans[i] = nums[i] * nums[i];

        Arrays.sort(ans);
        return ans;
    }
}
