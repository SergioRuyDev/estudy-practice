package educative;

import java.util.Arrays;

//Sorting is a technique to arrange the list of items into a particular order.
//
//Write a program to sort the array values in ascending order. An array with integer values in it is given,
// which has to be sorted in the order such that the smallest element is at the start of the array and the
// greatest element is at the end.

public class SortArray {
    public static void main(String[] args) {

        int array1[] = {5, 2, 7, 9, 1};
        int temp = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < (array1.length - i - 1); j++) {
                if (array1[j] > array1[j + 1]) {
                    temp = array1[j];
                    array1[j] = array1[ j +1];
                    array1[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "  ");
        }
//        In the program above:
//
//We use the variable array1 to store the array values.
//
//We use nested for loops.
//
//The outer loop traverses the entire length of the array.
//
//In the inner loop, we compare the array elements at the first index with the second index in the first iteration of the loop.
//
//In every subsequent iteration, we compare the element of each index with its next index.
//
//If the value at the current index is greater than the value at the next index, then we swap both array values using a variable temp.
//
//We display the sorted array in ascending order.

        // Other simple way

        int[] input = {5, 2, 7, 9, 1};
        Arrays.sort(input);
        System.out.println("The sorted array is: \n" + input[0] + " " + input[1] + " " + input[2] + " " + input[3] + " " +
                input[4]);
    }


}
