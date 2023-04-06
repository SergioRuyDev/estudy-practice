package educative;

//Write a program that reverses the order of elements in an array.
// The length of the array is restricted to eight values.

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        String[] originalArr = {"a", "e", "i", "o", "u", "w", "h", "y"};

        String[] reverseArr = new String[8];

        reverseArr[0] = originalArr[7];
        reverseArr[1] = originalArr[6];
        reverseArr[2] = originalArr[5];
        reverseArr[3] = originalArr[4];
        reverseArr[4] = originalArr[3];
        reverseArr[5] = originalArr[2];
        reverseArr[6] = originalArr[1];
        reverseArr[7] = originalArr[0];

        System.out.println("Original array: " + Arrays.toString(originalArr));
        System.out.println("Reversed array: " + Arrays.toString(reverseArr));


        // Other way using Char
        char[] v={'a', 'e', 'i', 'o', 'u', 'w', 'h', 'y'};
        System.out.print("Original array: " + v[0] + " " + v[1] + " " + v[2] + " " + v[3] + " " + v[4] + " " + v[5] + " " + v[6] + " " + v[7]);

        char t;
        t = v[0];
        v[0] = v[7];
        v[7] = t;

        t = v[1];
        v[1] = v[6];
        v[6] = t;

        t = v[2];
        v[2] = v[5];
        v[5] = t;

        t = v[3];
        v[3] = v[4];
        v[4] = t;

        System.out.print("\nReversed array: " + v[0] + " " + v[1] + " " + v[2] + " " + v[3] + " " + v[4] + " " + v[5] + " " + v[6] + " " + v[7]);

    }
}
