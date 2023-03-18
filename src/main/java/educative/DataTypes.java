package educative;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number");

        int number = scanner.nextInt();

        if ( (number >= 10) && (number <= 99) ) {
            System.out.println("Two Digits");
        } else {
            System.out.println("Not two digits");
        }

        scanner.close();
    }
}
