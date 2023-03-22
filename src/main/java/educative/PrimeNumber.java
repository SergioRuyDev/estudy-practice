package educative;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

//        Write a program that shows whether or not the natural number input by the user is a prime number.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number to check if its prime.");
        int number = scanner.nextInt();
        int countFactor = 0;


        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                countFactor += 1;
            }
        }
        if (countFactor == 2) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }



        scanner.close();
    }
}
