package educative;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side length of right angled triangle: ");
        int n = scanner.nextInt();
        for (int x = 0; x < n; x++)
        {
            for (int y = 0; y <= x; y++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
