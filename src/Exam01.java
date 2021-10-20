import javax.swing.*;

public class Exam01 {
    public static void main(String[] args) {

        int arr[][] = {{10, 45, 3, 8}, {2, 42}, {3, 21, 44}};
        System.out.println("The row with the largest length is " + largestLen(arr));
    }

        public static int largestLen ( int[][] myArray){
            int myNum = 0;
            int output = 0;
            for (int i = 0; i < myArray.length; i++) {
                int temp = 0;
                for (int j = 0; j < myArray[i].length; j++) {
                    temp += myArray[i][j];
                }
                if (myNum < temp) {
                    //myNum = temp;
                    output = i;
                }
            }
            return output;
        }
}
