package educativeDataStructures.arrayClass;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("THe index of element 4 in the array is " + index);

//It is possible that we may not need to search the entire array. In that case, we can provide the start and end index
// of the elements in the array that needs to be searched.
        index = Arrays.binarySearch(numbers, 1, 5, 4);

        System.out.println("The index of element 4 in the array is " + index);

        int[] newArray = Arrays.copyOf(numbers, numbers.length);

        System.out.println("The copied array is: ");

        for (int i : newArray) {
            System.out.print(i + " ");
        }

        int[] newArrayBiggerSize = Arrays.copyOf(numbers, 20);
        System.out.println();
        System.out.println("The copied array is: ");

        for (int i : newArrayBiggerSize) {
            System.out.print(i + " ");
        }

        int[] otherArray = Arrays.copyOfRange(numbers, 0, 5);
        System.out.println("\nThe copied array is: ");
        for (int i : otherArray) {
            System.out.println(i);
        }
    }
}
