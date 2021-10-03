// Muhammad Khan

package TextFileInput;
import TextFileInput.TextFileInput;
import java.util.StringTokenizer;

public class Lab08 {
    public static TextFileInput myFile;
    public static StringTokenizer myTokens;
    public static String animal;
    public static String[] animals;
    public static String line;


    public static void main(String[] args) {
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
    } //main

    // Lab 5 or lab 6 for reference to read text.input class
}
