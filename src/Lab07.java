import java.io.*;
import java.util.Scanner;

// Muhammad Khan

public class Lab07 {
    public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};

    public static void main(String[] args) throws NumberFormatException, IOException {
        printArray(myArray);
        printArrayEven(myArray);

        int[][] array = fillArray(args[0]);
        printArrayEven(array);
    }


    private static void printArray (int[][] theArray) {
        for (int i=0; i<theArray.length; i++) {
            for (int j=0; j<theArray[i].length;j++)
                display(theArray[i][j]);
            System.out.println();
        }
        System.out.println();
    }
    private static void display (int num){
        System.out.print(num+" ");
    }
    private static void printArrayEven(int[][] theArray){
        for (int i = 0; i < theArray.length; ++i) {
            for (int j = 0; j < theArray[i].length; ++j) {
                if (theArray[i][j] % 2 == 0) {
                    display(theArray[i][j]);
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] fillArray(String myFile) throws NumberFormatException, IOException {

        // Open file
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));

        // read the first line to get the total row number
        int row = Integer.parseInt(br.readLine());

        // read 2nd line to get the total col num
        int col = Integer.parseInt(br.readLine());

        // generate 2-d array
        int[][] myArray = new int[row][col];

        // read the rest of the file and save into each element
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = Integer.parseInt(br.readLine());
            }
        }
        // close the file
        br.close();

        return myArray;
    }
}
