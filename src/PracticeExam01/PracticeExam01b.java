package PracticeExam01;

import javax.swing.*;

public class PracticeExam01b {
    public static void main(String[] args) {

        // ------------------------------------------------------------------------------------ Q1

        String inputStr = JOptionPane.showInputDialog(null,
                "Enter your message: ");
        int num = 0;

        for (int i = 0; i < inputStr.length()-1; i++) {
            if (Character.isDigit(inputStr.charAt(i))
                    && Character.isDigit(inputStr.charAt(i + 1))) {
                ++num;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Two digits happen " + num + " times.");

        // ------------------------------------------------------------------------------------ Q2

        int[][] myArray1 = {{1,3,5,7,9}, {2,3,4,6,8}, {0,1,5,1,3}, {4,5,2,7,8}, {7,6,3,2,9}};
        int[][] myArray2 = {{1, 3, 3, 2}, {4, 2, 5, 6},{1, 2, 3, 4},{7, 8, 9, 4}};
        int[][] myArray3 = {{1, 3, 5, 6, 7}, {0, 8, 7, 4, 3}};
        int[][] myArray4 = {{1, 3, 3, 2},{4, 2, 5, 6},{1, 2, 3, 4},{7, 8, 9, 4}};

        System.out.println("diagonalEqualsRow (myArray1, 0): " + diagonalEqualsRow (myArray1, 0));
        System.out.println("diagonalEqualsRow (myArray2, 2): " + diagonalEqualsRow (myArray2, 2));
        System.out.println("diagonalEqualsRow (myArray3, 0): " + diagonalEqualsRow (myArray3, 0));
        System.out.println("diagonalEqualsRow (myArray1, 6): " + diagonalEqualsRow (myArray1, 6));
    }

    public static boolean diagonalEqualsRow(int[][] myArray, int row) {
        // Checking to see if the array is a square or not
        if (myArray.length != myArray[0].length) {
            throw new IllegalArgumentException("Not a square matrix");
        }
        else if (row >= myArray.length) {
            throw new IllegalArgumentException("Illegal row");
        }
        int num = 0, sum = 0;
        for (int i = 0; i < myArray[row].length; i++) {
            num += myArray[row][i];
        }
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i][i];
        }
        return  num == sum;
    }
} // main