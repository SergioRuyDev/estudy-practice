package educative;

//Write a program to check if an array contains the terms of the Fibonacci sequence.
// The length of the array is restricted to 20 elements only.

public class FibonacciArraySequence {
    public static void main(String[] args) {

        int[] seq = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 60, 987, 1597, 2584, 4181 };

        int count = 2;
        int fibFlag = 1;
        while (count < 20 && fibFlag == 1) {
            if(seq[count] != seq[count - 2] + seq[count - 1]) {
                fibFlag = 0;
            }
            count++;
        }
        if (fibFlag == 0) {
            System.out.println("It is not a Fibbonacci sequence due to the value " + seq[count - 1] + " at index " + (count - 1));
        } else {
            System.out.println("Hurrah ... we've got a Fibonacci sequence.");
        }

//        In the program above:
//
//We use a variable, seq, to store the array values.
//We use a variable, count, and assign it a value, 2.
//We use another variable, fibFlag, and assign it a value, 1.
//We use the while loop to check whether each element of the array results in a Fibonacci term or not. If the sequence
// is not true, then we update the variable fibFlag with a value, 0.
//In the end, we display the Fibonacci sequence. However, if the sequence is broken, we display the first outlier in
// the Fibonacci sequence instead.
    }
}
