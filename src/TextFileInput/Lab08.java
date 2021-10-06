// Muhammad Khan

package TextFileInput;
import TextFileInput.TextFileInput;

import java.io.*;
import java.util.StringTokenizer;

public class Lab08 {
    public static TextFileInput myFile;
    public static StringTokenizer myTokens;
    public static String animal;
    public static String[] animals;
    public static String line;

    // HW
    public static TextFileInput myArray;
    public static String firstLine;
    public static StringTokenizer twoDimArrayToken;
    public static String[] twoDimArray;
    public static String array;



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
//        myFile = new TextFileInput("twodimension8.txt");
//        firstLine = myFile.readLine();
//        myTokens = new StringTokenizer(firstLine, ",");
//        System.out.println("\nShould print first line " + firstLine);

        myArray = new TextFileInput("twodimension8.txt");
        array = myArray.readLine();
        twoDimArrayToken = new StringTokenizer(array, ",");
        twoDimArray = new String[twoDimArrayToken.countTokens()];
        int firstLine = 0;
        while (twoDimArrayToken.hasMoreTokens()) {
            twoDimArray[firstLine] = twoDimArrayToken.nextToken();
            firstLine++;
        }
        int row = 0;
        int col = 0;
        for (int j = 0; j < twoDimArray.length; j++) {
            row = Integer.parseInt(twoDimArray[j]);
            col = Integer.parseInt(twoDimArray[j]);
        }
        //System.out.println("\nExp: " + row + " " + col);


//        int[][] a = readArray(args[0]);
//        for (int j = 0; j < a.length; j++) {
//            System.out.println(a[j]);
//        }
    } //main

//    public static int[][] readArray(String file) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//        int row = Integer.parseInt(br.readLine());
//        int col = Integer.parseInt(br.readLine());
//
//        int[][] a = new int[row][col];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = Integer.parseInt(br.readLine());
//
//            }
//        }
//        br.close();
//        return a;
//
//    }

    // Lab 5 or lab 6 for reference to read text.input class
}
