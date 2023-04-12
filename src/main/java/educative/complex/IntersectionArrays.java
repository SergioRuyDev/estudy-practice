package educative.complex;

//The intersection of two arrays#
//The intersection operation gives the matching values of two arrays. Unlike sets, arrays may contain duplicate values.

public class IntersectionArrays {

    public static void main(String[] args) {

        int[] firstArr = {2, 5, 5, 8, 8, 8, 9, 30, 45}; // Enter the array 1
        int[] secondArr = {4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 45}; // Enter the array 2
        int lengthFirstArr = firstArr.length; // Calculating the length of firstArr
        int lengthSecondArr = secondArr.length; // Calculating the length of secondArr
        int lengthThirdArr;
        if (lengthSecondArr < lengthFirstArr) {
            lengthThirdArr = lengthSecondArr;
        } else {
            lengthThirdArr = lengthFirstArr;
        }
        int[] thirdArr = new int[lengthThirdArr]; // Creating thirdArr of zeros
        int i, j, k;
        i = j = k = 0;

        while ((i < lengthFirstArr) && (j < lengthSecondArr)) // This loop will terminate until the value of i,j are
            // less than lengthFirstArr and lengthSecondArr
        {
            if (firstArr[i] == secondArr[j]) // If the element of firstArr is equal to the element of secondArr
            {
                thirdArr[k] = firstArr[i]; // Assigning value of firstArr to k
                i += 1;
                j += 1;
                k += 1;
            } else // If the element of firstArr is not equal to the element of secondArr
            {
                if (firstArr[i] < secondArr[j]) // If the element of firstArr is less than the element of secondArr
                {
                    i += 1;
                }
                else // If the element of firstArr is not less than the element of secondArr
                {
                    j += 1;
                }
            }
        }
        printArray(firstArr, firstArr.length);
        printArray(secondArr, secondArr.length);
        printArray(thirdArr, k);
    }

    private static void printArray(int[] r, int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println(" ");
    }
//    Note: If the operand arrays are not sorted already, then the code for sorting it should be added before
//    entering the first loop.
}
