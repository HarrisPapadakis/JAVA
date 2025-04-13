import java.util.Random;
import java.io.IOException;

public class TestMatrixOperations {
    public static void main(String args[]) {
        Random random = new Random();
        
        // Generate random dimensions for the matrices (between 1 and 6)
        int xDim = random.nextInt(6) + 1;
        int yDim = random.nextInt(6) + 1;
        int zDim = random.nextInt(6) + 1;

        // Create 3 matrices
        int matrix1[][] = new int[xDim][yDim];
        int matrix2[][] = new int[yDim][zDim];
        int matrix3[][] = new int[xDim][zDim];

        // Test printing initial (uninitialized) matrices
        System.out.print("________________________TESTING printMatrix______________");
        System.out.println("\nMatrix1 initially is:");
        MatrixOperations.printMatrix(matrix1);

        System.out.println("\n\nMatrix2 initially is:");
        MatrixOperations.printMatrix(matrix2);

        System.out.println("\n\nMatrix3 initially is:");
        MatrixOperations.printMatrix(matrix3);

        // Test initialization of matrices
        System.out.print("________________________TESTING initializeMatrix______________");
        MatrixOperations.initializeMatrix(matrix1);
        MatrixOperations.initializeMatrix(matrix2);
        MatrixOperations.initializeMatrix(matrix3);

        System.out.println("\nMatrix1 after initialization:");
        MatrixOperations.printMatrix(matrix1);
        System.out.println("\nMatrix2 after initialization:");
        MatrixOperations.printMatrix(matrix2);
        System.out.println("\nMatrix3 after initialization:");
        MatrixOperations.printMatrix(matrix3);

        // Test matrix multiplication
        System.out.print("________________________TESTING multiply______________");
        multiply(matrix1, matrix2, "MATRIX1", "MATRIX2"); // valid dimensions
        multiply(matrix1, matrix3, "MATRIX1", "MATRIX3"); // possibly invalid dimensions

        // Wait for key input to keep console open
        try {
            int key = System.in.read();
        } catch (IOException e) {
            System.out.println("Error reading from input");
        }
    }

    // Method to test and print the result of matrix multiplication
    public static void multiply(int[][] m1, int[][] m2, String name1, String name2) {
        if (MatrixOperations.legalMultiplication(m1, m2)) {
            int[][] result = MatrixOperations.multiply(m1, m2);
            System.out.printf("\nThe result of multiplying %s by %s is:\n", name1, name2);
            MatrixOperations.printMatrix(result);
        } else {
            System.out.printf("\nMultiplication of %s by %s is not possible!\n", name1, name2);
        }
    }
}
