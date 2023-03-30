package educative;

import java.util.Scanner;

public class WhileSum {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        while (a != 0) // This loop will terminate when the value of a is not zero.
        {
            System.out.println("Enter the number: ");
            a = myObj.nextInt(); // Taking input from the user in variable a
            sum += a; // Calculating the sum
        }
        System.out.println("Sum is: " + sum);
    }
}
