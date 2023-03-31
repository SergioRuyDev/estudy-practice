package educative;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square: ");
        int refactor = scanner.nextInt();
        for (int x = 0; x < refactor; x++)
        {
            for (int y = 0; y < refactor; y++)
            {
                if (x == 0 || x == refactor - 1 || y == 0 || y == refactor - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
