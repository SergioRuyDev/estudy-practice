package educative;

import java.util.Scanner;

public class TableN {
    public static void main(String[] args) {
//    Write a program that takes an integer input by the user and prints a multiplication table for the first 20
//    multiples, as illustrated below.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            int table = number * i;

            System.out.println(number + " x " + i + " = " + table);
        }
        scanner.close();
    }
}
