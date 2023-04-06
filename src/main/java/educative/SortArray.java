package educative;

import java.util.Arrays;

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

        // Other simple way

        int[] input = {5, 2, 7, 9, 1};
        Arrays.sort(input);
        System.out.println("The sorted array is: \n" + input[0] + " " + input[1] + " " + input[2] + " " + input[3] + " " +
                input[4]);
    }
}
