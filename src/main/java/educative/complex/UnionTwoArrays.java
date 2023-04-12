package educative.complex;

//The union of two arrays
//The union operation combines two sets, skipping the matching values of both sets while populating the resultant set.

public class UnionTwoArrays {
    public static void main(String[] args) {

        int[] firstArr = {2, 5, 5, 8, 8, 8, 9, 30, 45}; // Enter the array 1
        int[] secondArr = {4, 5, 5, 6, 7, 7, 8, 9, 10}; // Enter the array 2
        int lengthFirstArr = firstArr.length; // Calculating the length of 1
        int lengthSecondArr = secondArr.length; // Calculating the length of 2
        int lengthFirstAndSecond = lengthFirstArr + lengthSecondArr;
        int[] thirdArray = new int[lengthFirstAndSecond]; // Creating 3 of zeros
        int i, j, k;
        i = j = k = 0;

        while ((i < lengthFirstArr) && (j < lengthSecondArr)) // This loop will terminate until the value of i,j are
            // less than lengthFirstArr and lengthSecondArr
        {
            if (firstArr[i] < secondArr[j]) // If the elements of firstArr is less than element of secondArr
            {
                thirdArray[k] = firstArr[i]; // Assign the value of firstArr to thirdArray
                i += 1;
            }
            else // If the element of firstArr is not less than element of secondArr
            {
                if (firstArr[i] > secondArr[j]) // If the element of firstArr is greater than element of secondArr
                {
                    thirdArray[k] = secondArr[j]; // Assign the value of secondArr to thirdArray
                    j += 1;
                }
                else // The elements of firstArr and secondArr are equal
                {
                    thirdArray[k] = firstArr[i];
                    i += 1;
                    j += 1;
                }
            }
            k += 1;
        }
        while (i < lengthFirstArr) // This loop will terminate until the value of i is less than lengthFirstArr
        {
            thirdArray[k] = firstArr[i];
            i += 1;
            k += 1;
        }
        while (j < lengthSecondArr)  // This loop will terminate until the value of j is less than lengthSecondArr
        {
            thirdArray[k] = secondArr[j];
            j += 1;
            k += 1;
        }
        printArray(firstArr, firstArr.length);
        printArray(secondArr, secondArr.length);
        printArray(thirdArray, k);
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
