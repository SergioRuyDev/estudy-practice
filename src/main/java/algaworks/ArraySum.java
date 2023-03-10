package algaworks;

import java.util.Arrays;
import java.io.*;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            System.out.println(sum);
        }

        // Using Streams
        int sums = Arrays.stream(numbers).sum();
        System.out.println(sums);

    }
}
