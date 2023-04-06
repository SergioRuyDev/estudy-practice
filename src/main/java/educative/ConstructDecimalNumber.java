package educative;

//Write a program that converts an array of single-digit values into a single decimal number.
// The length of the array is restricted to five values.
public class ConstructDecimalNumber {
    public static void main(String[] args) {

        int[] values = { 1, 2, 3, 4, 5 };
        int dnum = 0;
        dnum += values[0] * ((int) Math.pow(10, 4));
        dnum += values[1] * ((int) Math.pow(10, 3));
        dnum += values[2] * ((int) Math.pow(10, 2));
        dnum += values[3] * ((int) Math.pow(10, 1));
        dnum += values[4] * ((int) Math.pow(10, 0));

        System.out.println(dnum);
    }
}
