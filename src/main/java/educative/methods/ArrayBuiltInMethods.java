package educative.methods;

import java.util.Arrays;

//The Arrays.fill() method replaces the whole array with a specific value. It takes two parameters, one is the array
// and the second one is the value.
//The Arrays.copyOf() method returns an array that consists of the copy elements from the source array.
//It takes two parameters, one is the source array and the second is the length of the array.
//The Arrays.sort() method sorts the array in ascending order. Non-numeric values are sorted based on their ASCII codes.
public class ArrayBuiltInMethods {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 6, 9, 10, 4};
        int b[] = {1, 2, 3, 6, 91, 11, 98};

        Arrays.fill(a, 916);
        System.out.println("Filling every value of array with 916: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.print("\nComparing both the arrays: " + Arrays.equals(a, b));

        int[] c = Arrays.copyOf(a , 7);

        System.out.println("\nCreating a new copy of array b in array c: ");
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");

        int[] nums = {1, 1, 30, 40, 0, 4, 40, 5};

        // SORT METHOD
        System.out.print("\nOriginal array of numbers: ");
        for (int i = 0 ; i < nums.length ; i++)
            System.out.print(nums[i]+" ");
        Arrays.sort(nums);
        System.out.print("\nSorted list of numbers: ");
        for (int i = 0 ; i < nums.length ; i++)
            System.out.print(nums[i]+" ");

        String alphs = "zigZAGavpqOIA";
        System.out.print("\nOriginal string: "+ alphs);
        char[] alphs_ch = alphs.toCharArray();
        Arrays.sort(alphs_ch);
        System.out.print("\nSorted array of alphabets: ");
        System.out.print(alphs_ch);
    }
}
