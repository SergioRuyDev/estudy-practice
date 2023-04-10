package educative;

public class SumRows {
    public static void main(String[] args) {

        int[][] input = {{10, 20, 30},
                {40, 50, 60}};

        int sumRow1 = input[0][0] + input[0][1] + input[0][2];
        int sumRow2 = input[1][0] + input[1][1] + input[1][2];

        System.out.println("Matrix: ");
        for (int i =0; i < 2; i++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(input[i][y] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("Sum of Row1: " + sumRow1);
        System.out.println("Sum of Row2: " + sumRow2);


    }
}
