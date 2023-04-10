package educative;

import java.util.Scanner;

// We usually use the while loop to deal with arrays when the number of iterations is not fixed.
// For example, let’s say we want to generate n terms of a Fibonacci sequence and store it in an array,
// where n is the user input.
// A Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones,
// except the first two terms.
public class WhileFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the number of terms (maximum 20) for the Fibonacci sequence: ");
        number = scanner.nextInt();
        if (number <= 1 || number > 20)
        {
            System.out.println("It seems the number of terms for the Fibonacci sequence has an invalid value: ");
        }
        else
        {
            int[] fib = new int[number];
            fib[0] = 0;
            fib[1] = 1;

            System.out.println("First n terms of fibonacci sequence are: ");
            int count = 2;

            while(count < number)
            {
                fib[count] = fib [count - 2] + fib [count - 1]; //adding last two terms
                count ++;
            }
            for (int i = 0; i < number; i++)
            {
                System.out.print(fib[i] + " ");
            }
        }
        System.out.println("\n*** Finish generating Fibonacci Numbers ***");
    }
}
