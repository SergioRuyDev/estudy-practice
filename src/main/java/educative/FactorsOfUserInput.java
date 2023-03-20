package educative;

import java.util.Scanner;

public class FactorsOfUserInput {
    public static void main(String[] args) {
//        Write a program that shows all the factors of a number provided by the user.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number to check the Factors.");
        int factor = scanner.nextInt();

        for (int i = 1; i <= factor; i++) {
            if (factor % i == 0) {
                System.out.println(i);
            }
        }
    }
}
