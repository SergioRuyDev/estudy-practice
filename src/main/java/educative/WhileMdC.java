package educative;

import java.util.Scanner;

//        Greatest common divisor
//        The greatest common divisor is the largest integer which is an exact divisor of each of the
//        two other integers. Write a program that inputs two natural numbers from the user and displays
//        their greatest common divisor (GCD) also known as the highest common factor (HCF).

public class WhileMdC {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int r = 0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        a = myObj.nextInt();
        System.out.println("Enter number 2: ");
        b = myObj.nextInt();
        while (b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println ("The greatest common divisor is: " + a);

    }
}
