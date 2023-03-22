package educative;

import java.util.Scanner;

public class WhileAverage {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int inputCount = 0;
        double sum = 0;

        while (a != 0) {
            System.out.println("Enter the number: ");
            a = scanner.nextInt();
            inputCount += 1;
            sum += a;
        }

        if (inputCount > 1) {
            System.out.println("Average of inputs is: " + sum / (inputCount - 1));
        }
    }
}
