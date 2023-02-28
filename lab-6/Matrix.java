public class Matrix {
    public static void main(String[] args) {
        int[][] mat1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] mat2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        // Addition of two matrices
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Multiplication of two matrices
        int[][] product = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum1 = 0;
                for (int k = 0; k < 3; k++) {
                    sum1 += mat1[i][k] * mat2[k][j];
                }
                product[i][j] = sum1;
            }
        }

        // Print the result
        System.out.println("Matrix 1:");
        printMatrix(mat1);
        System.out.println("Matrix 2:");
        printMatrix(mat2);
        System.out.println("Sum:");
        printMatrix(sum);
        System.out.println("Product:");
        printMatrix(product);
    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

