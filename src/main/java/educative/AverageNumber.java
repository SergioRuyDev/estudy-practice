package educative;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
//        Write a program that calculates the average of the numbers input by the user. The program first asks the user
//        how many values they want to average. The number of values should be greater than 0.

        Scanner scanner = new Scanner(System.in);

        System.out.println("how many values do you want to average?");
        int average = scanner.nextInt();
        double sumOfValues = 0;
        int nextValue;

        for (int i = 1; i <= average; i++) {
            System.out.println("Enter value # " + i);
            nextValue = scanner.nextInt();
            sumOfValues += nextValue;
        }
        if (average > 0) {
            System.out.println("The average is: " + (sumOfValues / average));
        }

    }
}
