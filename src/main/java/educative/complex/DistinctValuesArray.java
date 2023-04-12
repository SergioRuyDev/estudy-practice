package educative.complex;

//Distinct values in an array
//The following program generates a new array with the unique values of the operand array.
//Note: If the operand array is not sorted already, then the code for sorting it should be added before entering the
// first loop.

import java.util.Arrays;

public class DistinctValuesArray {
    public static void main(String[] args) {


//        int[] p ={2, 5, 5, 8, 8, 8, 9, 30, 45}; // Enter the array
        int[] p ={5,8,8,8,30,45,2,9,5};
        int lp = p.length; // Calculating the length of p
        int[] r = new int[lp]; // Creating r of zeros
        int i , k;
        i = k = 1;
        Arrays.sort(p);
        for (int j = 0 ; j < lp ; j++)
        {
            r[j] = p[0];
        }
        while (i < lp) // This loop will terminate until the value of i is less than lp
        {
            if (p[i] != p[i - 1]) // If the element of p is not equal to the previous element
            {
                r[k] = p[i]; // Assigning p to k
                k += 1;
            }
            i += 1;
        }
        printArray(p, p.length);
        printArray(r, k);
    }
    static void printArray(int[] a, int size)
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
