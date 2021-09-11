import javax.swing.*;  // * means everything belongs to swing package

public class Lab04 {
    public static void main(String[] args) {

        String[] wordArray = { "hello", "goodbye", "cat", "dog",
                "red", "green", "sun", "moon" };
        String isOrIsNot, inputWord;

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
    } // wordIsThere
} // class Lab4Program1

