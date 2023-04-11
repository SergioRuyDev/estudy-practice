package educative.methods;

public class MethodFibonacci {
    public static void main(String[] args) {

        int numb = 10;
        fibo(numb);
    }

    private static void fibo(int n) {
        System.out.println("First " + n + " terms of Fibonacci sequence are:");

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        int count = 2;

        while(count < n)
        {
            fib[count] = fib [count - 2] + fib [count - 1]; //adding last two terms
            count ++;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(fib[i] + " ");
        }

        System.out.println("\n*** Finish generating Fibonacci Numbers ***");
    }
}
