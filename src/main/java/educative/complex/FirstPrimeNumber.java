package educative.complex;

//Store the first n prime numbers in the array
//The following program stores the first n prime numbers to an array. The value of n is chosen by the user,
// and any number can be used.

public class FirstPrimeNumber {
    public static void main(String[] args) {
        int n = 5; // The number of prime numbers to be stored
        if (n < 1) {// checks for the validity of input

            System.out.println("It seems the number of desired prime numbers has got an invalid value: ");
        }
        else {
            int[] p = new int[n]; // generate an array to store n values with initial value of 2 for all elements
            p[0] = 2; // storing 2 at the 0th index
            int pcount = 0;
            int v = p[pcount] +1; // the value to be tested
            int r, i, pflag;
            while (pcount < (n - 1)) {// loop for number of generated values
                r = pcount + 1;
                i = 0;
                pflag = 0;
                while (i <= pcount && pflag == 0) {// loop for testing v against each prime number p[i]

                    if (v % p[i] == 0) {
                        v += 1; // current v is not a prime number, generate next value to be tested
                        pflag = 1; // flag to stop the inner loop
                    }
                    else {
                        i += 1; // move forward the index in the array of prime numbers
                    }
                }
                if (pflag == 0) {// check flag after finishing the inner loop
                    pcount += 1; // increment pcount, we found next prime number
                    p[pcount] = v; // store the next prime number at next position in the array
                }
            }
            printArray(p, n);
        }
    }
    static void printArray(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
