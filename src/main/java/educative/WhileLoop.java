package educative;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = myObj.nextInt();  // Taking input in variable a
        while (a > 0)// This loop will terminate if the value is not greater than 0
        {
            System.out.println(a % 10);
            a /= 10; //Dividing a by 10 and assigning the result to variable a
        }

    }
}
