package educative;

//Write a program that uses an array and finds the index of the first outlier and stores it to the variable idx.
// The array is guaranteed to have at least 5 elements and the first two elements will be in the required arithmetic
// sequence. The value of the idx should be 1 if the array has no outlier, and should be 0 if the array length is less
// than 5.

public class OutlierArithmeticSequence {
    public static void main(String[] args) {

        int[] array1 = {5,8,11,13,17};
        int idx = 1;
        // Start your code from here
        int diff;
        if ((array1.length) < 5) // Checking the length of array, if it is less than 5
        {
            idx = 0;
            System.out.println("The array contains less than 5 elements");
        }
        else
        {
            diff = array1[0] - array1[1]; // Taking difference
            for (int i = 1; i < ((array1.length) - 1); i++)
            {
                if ((array1[i] - array1[i + 1]) != diff && idx == 1)
                {
                    idx = i + 1;
                    System.out.println("The outlier value is at the index: " + idx);
                }
            }
            if (idx == 1)
            {
                idx = -1;
                System.out.println("There is no outlier in the array");
            }
        }
    }
}
