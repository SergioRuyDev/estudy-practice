package educative.complex;

//Calculate the product of two matrices
//Write a program to display the product of these two matrices a[3x4] and b[4x2].
//Resulting in a matrix c[3x2]

public class CalculateMatricesProduct {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};

        int[][] b = {{10, 20},{30, 40},{50, 60},{70, 80}};

        int aROWS = 3;
        int aCOLS = 4;
        int bROWS = 4;
        int bCOLS = 2;
        int cROWS = 3;
        int cCOLS = 2;

        int[][] c = {{0, 0},{0, 0},{0, 0}};
        for (int i = 0; i < aROWS; i++) {
            for (int j = 0; j < aCOLS; j++) {
                for (int k = 0; k < bCOLS; k++)
                    c[i][k] += a[i][j] * b[j][k];
            }
        }

        System.out.println("Matrix Product: ");
        for (int i = 0; i < cROWS; i++) {
            for (int j =0; j < cCOLS; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }
}
