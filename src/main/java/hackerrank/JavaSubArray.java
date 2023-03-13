// Sub Array Java Challenge

//We define the following:
//
//A subarray of an n-element array is an array composed from a contiguous block of the original array's elements. For example, if array = [1,2,3], then the subarrays are [1], [2], [3], [1,2], [2.3], and [1,2,3]. Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.
//The sum of an array is the total sum of its elements.
//An array's sum is negative if the total sum of its elements is negative.
//An array's sum is positive if the total sum of its elements is positive.
//Given an array of n integers, find and print its number of negative subarrays on a new line.

//Input Format

//The first line contains a single integer, n, denoting the length of array A = [a0, a1, ..., an-1].
//The second line contains n space-separated integers describing each respective element, ai, in array A.

//Constraints

//1 <= n <= 100
//-10^4 <= ai <= 10^4

//Output Format

//Print the number of subarrays of A having negative sums.


package hackerrank;

import java.util.Scanner;

public class JavaSubArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

        }

        scan.close();

        int negative_subarrays = 0;

        for (int i =0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int current_sum = 0;

                for (int k = i; k <= j; k++) {
                    current_sum += arr[k];
                }

                if (current_sum < 0) {
                    negative_subarrays++;
                }
            }
        }
        System.out.println(negative_subarrays);
    }
}
