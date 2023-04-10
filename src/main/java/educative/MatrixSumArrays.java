package educative;

public class MatrixSumArrays {
    public static void main(String[] args) {

        int[][] matrixA = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}}; //declaring a matrixA
        int[][] matrixB = {{10, 12, 13, 14},
                {15, 16, 17, 18},
                {19, 20, 21, 22}}; //declaring a matrixB
        int[][] matrixC = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}}; //declaring an empty matrixC

        System.out.println("Matrix A");
        for (int i = 0; i < 3; i++) // Printing values of matrixA
        {
            for (int j = 0; j < 4; j++)
                System.out.print(matrixA[i][j] + "\t");

            System.out.println(" ");
        }

        System.out.println("Matrix B");
        for (int i = 0; i < 3; i++) // Printing values of matrixB
        {
            for (int j = 0; j < 4; j++)
                System.out.print(matrixB[i][j] + "\t");

            System.out.println(" ");
        }

        for (int i = 0; i < 3; i++) // adding two matrixes
        {
            for (int j = 0; j < 4; j++)
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
        }

        System.out.println("Matrix C");
        for (int i = 0; i < 3; i++) // Printing values of matrixC
        {
            for (int j = 0; j < 4; j++)
                System.out.print(matrixC[i][j] + "\t");

            System.out.println(" ");
        }

//        The resulting matrix isn’t a sum of values of operands. Rather, it’s a matrix that has six members
//        (three from matrixA and three from matrixB). We need to access the individual integer values in
//        each matrix to produce their sum.
    }
}
