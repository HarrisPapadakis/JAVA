import java.util.Random;

public class MatrixOperations {
    // Random object for generating random numbers
    private static Random random = new Random();

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) { // iterate rows
            for (int j = 0; j < matrix[0].length; j++) { // iterate columns
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Method to initialize a matrix with random values from 0 to 19
    public static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) { // iterate rows
            for (int j = 0; j < matrix[0].length; j++) { // iterate columns
                matrix[i][j] = random.nextInt(20); // value range [0, 19]
            }
        }
    }

    // Method to check if two matrices can be legally multiplied
    public static boolean legalMultiplication(int[][] matrix1, int[][] matrix2) {
        // matrix1 columns must match matrix2 rows
        return matrix1[0].length == matrix2.length;
    }

    // Method to perform matrix multiplication
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        // Result matrix dimensions: [rows of matrix1] x [columns of matrix2]
        int[][] result = new int[matrix1.length][matrix2[0].length];

        // Standard matrix multiplication algorithm
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
