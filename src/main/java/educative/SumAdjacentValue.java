package educative;

//Write a program that displays the sum of every two adjacent values in an array.

public class SumAdjacentValue {
    public static void main(String[] args) {

        int[] value = {10, 20, 30, 40, 50};
        value[0] += value[1];
        value[1] += value[2];
        value[2] += value[3];
        value[3] += value[4];
        System.out.println(value[0] + ", " + value[1] + ", " + value[2] + ", " + value[3] + ", " + value[4]);

    }
}
