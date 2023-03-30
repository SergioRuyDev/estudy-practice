package educative;

import java.util.Scanner;

public class SquareAsterisks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of square: ");
        int square = scanner.nextInt();

        for (int x = 1; x <= square; x++) {
            for (int y = 1; y <= square; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
