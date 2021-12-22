package Exam01;

/*
Write a method called largestRow  that take a two-dimension array of integers as a
parameter and returns the number of the row that has the largest length. For example,
if the array (as created by the program below) is

10 45  3  8
2 42
3 21 44

The value returned would be zero (row zero has the largest length).
 */

public class Question02 {
    public static void main(String[] args){

        int[][] arr = {{10, 45, 3, 8}, {2, 42}, {3, 21, 44}};

        System.out.println("The row with the largest length is " + largestLen(arr));

    } //main

    public static int largestLen(int[][] myArray) {
        int row = 0;                                // storing row number
        int length = 0;                             // storing length
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].length > length) {       // if length is greater than length value
                row = i;                            // row number is updated
                length = myArray[i].length;         // length value is changed
            }
        }
        return row;
    }
}
