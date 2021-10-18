import javax.swing.*;

public class PracticeExam01 {

    public static void main(String[] args) {

        // --------------------------------------------- Q1
//        if (args.length == 2) {
//            int n1 = Integer.parseInt(args[0]);
//            int n2 = Integer.parseInt(args[1]);
//
//            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
//            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
//        }
//        else {
//            throw new IllegalArgumentException();
//        }

        // --------------------------------------------- Q2
        int arr[][] = {{10, 45}, {2, 42, 67, 5}, {3, 21}};
        System.out.println("\nSum = "+ getSumOfRow(arr, 1));

    }
    private static int getSumOfRow (int [][] myArray, int row) {
        int sum = 0;
        for (int i = 0; i < myArray[row].length; i++) {
                sum += myArray[row][i];
        }
        return sum;
    } // getSumOfRow
}
