package educative;

import java.util.Scanner;

public class RectangleAsterisks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of rectangle: ");
        int height = scanner.nextInt();

        System.out.println("Enter the width of rectangle: ");
        int width = scanner.nextInt();

        for (int x = 1; x <= height; x++) {
            for (int y = 1; y <= width; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
