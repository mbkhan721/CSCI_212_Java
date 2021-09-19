// Muhammad Khan - Lab 05

import javax.swing.*;
import java.io.BufferedReader;  // Reads text from character input stream
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.*;
public class Lab05 {
    public static void main(String[] args) throws IOException {

        String[] wordArray = new String[10];
        String isOrIsNot, inputWord;
        int lengthFilled = 0;

        // Read input file
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        String line = br.readLine();
        //System.out.println(line);

        while (lengthFilled < wordArray.length && line != null) {
            wordArray[lengthFilled++] = line;
            line = br.readLine();
        }
        if (line!= null) {
            System.out.println("File contains too many names.");
            System.out.println("This program can process only " + wordArray.length + " numbers.");
            System.exit(1);
        }
        br.close();


        // This line asks the user for input by popping out a single window
        // with text input

        //              class        function
        while (true) {
            inputWord = JOptionPane.showInputDialog(null,
                    "Enter a word in all lower case:");
            if (inputWord.equals("STOP"))
                System.exit(0);


            // if the inputWord is contained within wordArray return true
            if (wordIsThere(inputWord, wordArray))
                isOrIsNot = "is"; // set to is if the word is on the list
            else
                isOrIsNot = "is not"; // set to is not if the word is not on the list

            // Output to a JOptionPane window whether the word is on the list or not
            JOptionPane.showMessageDialog(null,
                    "The word " + inputWord + " " + isOrIsNot + " on the list.");
        }
    } //main

    public static boolean wordIsThere(String findMe, String[] theList) {
        // find if findMe = elements of array
        for (String s : theList) {
            if (findMe.equals(s)) {
                return true;
            }
        }
        return false;
        // Algorithm:
        // Step1: iterate the list and access each element
        // Step2: compare the input with the current element
        // Step2.5: if equals, then return true -> if statement
        // Step3: if not equal, move to next element
        // Step4: repeat step2 to step3, until the array end
        // Step5: return false
    }
    // zoom video stopped at 17:34
}
