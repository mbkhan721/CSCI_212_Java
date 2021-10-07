// Muhammad Khan

package TextFileInput;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab08 {
    public static TextFileInput myFile;
    public static StringTokenizer myTokens;
    public static String[] animals;
    public static String line;


    public static void main(String[] args) throws IOException {
        /*
         * Open the file and read a line
         */
        myFile = new TextFileInput("animals.txt");
        line = myFile.readLine();
        System.out.println("\nThe input line is "+line);
        /*
         * Create a new StringTokenizer, passing the String and the delimeter (",")
         */
        // comma will divide the String elements as a separate token
        myTokens = new StringTokenizer(line,",");
        // countTokens will return the int number of tokens
        System.out.println("There are "+myTokens.countTokens()+" tokens in the line.");
        /*
         * Declare an array whose size is equal to the number of tokens found
         * using the method countTokens from the StringTokenizer class
         */
        animals = new String[myTokens.countTokens()];
        /*
         * Get the separated strings one by one from the StringTokenizer and put
         * them in the array
         */
        int i=0;
        while (myTokens.hasMoreTokens()) {
            animals[i]=myTokens.nextToken();
            i++;
        }
        /*
         * Print the array
         */
        for (int j=0;j<animals.length;j++)
            System.out.println(animals[j]);

        // Homework
        File myArray = new File("twodimension8.txt");
        Scanner read = new Scanner(myArray);

        String[] arr;
        arr = read.nextLine().split(",");
        int row = Integer.parseInt(arr[0]);
        int col = Integer.parseInt(arr[1]);
        int[][] a = new int[row][col];

        for (int j = 0; j < row; j++) {
            arr = read.nextLine().split(",");
            for (int k = 0; k < col; k++) {
                a[j][k] = Integer.parseInt(arr[k]);
            }
        }
        read.close();

        System.out.println();
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                System.out.print(a[j][k] + " ");
            }
            System.out.println();
        }
    }
}
