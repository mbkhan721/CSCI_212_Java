package Lab10_Program_JavaDoc;
// Muhammad Khan
// Lab 10

import java.util.Arrays;

/***************************************************************
 *
 * @author K. Lord
 * A program that works with two-dimension arrays.
 *
 */

public class Lab10 {
    private static int[][] matrix;

    public static void main(String[] args) {

        matrix = new int[6][4];
        fillMatrix(matrix, 5);
        System.out.println(sumMatrix(matrix));

        int[][] matrixSeq = new int[2][4];
        int v = 2;
        fillMatrixSeq(matrixSeq, 4);
        System.out.println("\nMatrix Sequence: ");
        System.out.println(Arrays.deepToString(matrixSeq));


        int[][] addMatrixRow = new int[3][4];
        sumMatrixRow(addMatrixRow);
        System.out.println("\nSum Matrix Row: ");
        System.out.println(Arrays.deepToString(addMatrixRow));
    }

    /**
     * Each cell of an integer matrix is filled with
     * the given value.
     *
     * @param m The matrix to be filled
     * @param v The value to fill in each cell
     */
    public static void fillMatrix(int[][] m, int v) {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = v;
    }

    /**
     * Used for filling the matrix
     * @param m The 2-D array parameter size
     * @param v int parameter value to be passed on to this function
     */
    public static void fillMatrixSeq(int[][] m, int v) {
        int seqValue = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = seqValue++;
    }

    /**
     * Return sum of the matrix
     * @param m The matrix to be summed
     * @return int the sum value of the matrix
     */
    public static int sumMatrix(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                sum += m[i][j];
        return sum;
    }

    /**
     * This is a comment added by Muhammad Khan
     * @param m This function returns the sum of row
     * @return integer value of the row
     */
    public static int sumMatrixRow(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                sum += m[i][j];
        return sum;
    }
}