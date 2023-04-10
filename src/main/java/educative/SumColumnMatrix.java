package educative;

//Calculate the sum of each column in a matrix#
//Write a program to show a matrix in the form of rows and columns, then show the sum of each column. The matrix must
// have five rows and ten columns.

public class SumColumnMatrix {

    public static void main(String[] args) {

        int[][] input = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                {40, 41, 42, 43, 44, 45, 46, 47, 48, 49}};

        int sumColumn1 = input[0][0] + input[1][0] + input[2][0]+ input[3][0]+ input[4][0];
        int sumColumn2 = input[0][1] + input[1][1] + input[2][1]+ input[3][1]+ input[4][1];
        int sumColumn3 = input[0][2] + input[1][2] + input[2][2]+ input[3][2]+ input[4][2];
        int sumColumn4 = input[0][3] + input[1][3] + input[2][3]+ input[3][3]+ input[4][3];
        int sumColumn5 = input[0][4] + input[1][4] + input[2][4]+ input[3][4]+ input[4][4];
        int sumColumn6 = input[0][5] + input[1][5] + input[2][5]+ input[3][5]+ input[4][5];
        int sumColumn7 = input[0][6] + input[1][6] + input[2][6]+ input[3][6]+ input[4][6];
        int sumColumn8 = input[0][7] + input[1][7] + input[2][7]+ input[3][7]+ input[4][7];
        int sumColumn9 = input[0][8] + input[1][8] + input[2][8]+ input[3][8]+ input[4][8];
        int sumColumn10 = input[0][9] + input[1][9] + input[2][9]+ input[3][9]+ input[4][9];


        System.out.println("Displaying in the matrix form: ");
        for (int i = 0; i < 5; i++) {
            for (int y = 0; y < 10; y++){
                System.out.print(input[i][y] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("Column sums are: " + sumColumn1 + " " + sumColumn2 + " " + sumColumn3 + " " + sumColumn4
        + " " + sumColumn5 + " " + sumColumn6 + " " + sumColumn7 + " " + sumColumn8 + " " + sumColumn9 + " " +
                sumColumn10);



//        OTHER WAY
        int rows = 5;
        int cols = 10;
        int[][] mat = {{0, 1, 2, 3, 4, 5, 6, 7, 8,9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                {40, 41, 42, 43, 44, 45, 46, 47, 48, 49}};  // Creating a matrix

        System.out.println("Displaying in the matrix form: ");
        for (int i = 0; i < rows; i++) // printing a 2-dimensional array
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println(" ");
        }
        int[] colsum = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int j = 0; j < cols; j++)
        {
            for (int i = 0; i < 5; i++ )
            {
                colsum[j] += mat[i][j];  //calculating sum
            }
        }

        System.out.print("Column sums are: ");
        for (int i = 0; i < 10; i++) // printing a 2-dimensional array
        {
            System.out.print(colsum[i] + " ");
        }

    }

}
