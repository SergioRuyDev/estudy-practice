package educative;

public class TwoArrayDimensions {
    public static void main(String[] args) {

        int[][] array1 = {{10, 20, 30}, {16, 18, 20}};

        for (int i = 0; i < 2; i++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(array1[i][y] + " ");
            }
            System.out.println(" ");
        }

        int[][] array2 = {{1, 2}, {4, 5}, {7, 8}}; //declaring a 2-dimensional array
        for (int i = 0; i < 3; i++) // printing a 2-dimensional array
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println(" ");
        }

        int[][] array3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //declaring a 2-dimensional array
        for (int i = 0; i < 3; i++) // printing a 2-dimensional array
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
