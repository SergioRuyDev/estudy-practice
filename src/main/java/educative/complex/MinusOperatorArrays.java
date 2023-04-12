package educative.complex;

//The minus operator for two arrays
//The following program implements the minus operator for arrays similar to sets. It’s assumed that the operand arrays
// are sorted, and the resulting array may contain duplicates, depending upon the contents of the operands.

public class MinusOperatorArrays {
    public static void main(String[] args) {
        int[] p = {2, 5, 5, 8, 8, 8, 9, 30, 45}; // Enter the array 1
        int[] q = {4, 5, 5, 6, 7, 7, 8, 9, 10}; // Enter the array 2
        int lp = p.length; // Calculating the length of p
        int lq = q.length; // Calculating the length of q
        int lr = lp + lq;
        int[] r = new int[lr]; // Creating r of zeros
        int i, j, k;
        i = j = k = 0;

        while ((i < lp) && (j < lq)) // This loop will terminate until the value of i,j are less than lp and lq
        {
            if (p[i] < q[j]) // If the element of p is less than the element of q
            {
                r[k] = p[i]; // Assigning p to r
                i += 1;
                k += 1;
            }
            else // If the element of p is not less than the element of q
            {
                if (p[i] > q[j]) // If the element of p is greater than element of q
                {
                    j += 1;
                }
                else // The elements of p and q are equal
                {
                    i += 1;
                    j += 1;
                }
            }
        }

        while (i < lp) // This loop will terminate until the value of i is less than lp
        {
            r[k] = p[i]; // Assigning p to r
            i += 1;
            k += 1;
        }
        printArray(p, p.length);
        printArray(q, q.length);
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
