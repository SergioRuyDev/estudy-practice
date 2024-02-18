package leetcode;

public class TwoPointer {

    // technique to use for palindrome

    public static void main(String[] args) {

        String palindrome = "racecar";

        System.out.println(checkIfPalindrome(palindrome));

        int[] nums = new int[]{1, 2, 4, 6, 8, 9, 14, 15};

        System.out.println(checkSumPairs(nums, 13));

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

            if (curr < target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
