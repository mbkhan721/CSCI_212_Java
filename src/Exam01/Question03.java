package Exam01;

/*
Write a main method that will request the user to enter a word using a JOptionPane
input dialog. The method should continue accepting words until the user types “STOP”.

Then, using a JOptionPane message dialog, tell the user the total number of words
both of even length and of odd length that were entered via the JOptionPanes.
 */

import javax.swing.*;

public class Question03 {

    public static void main (String[] args) {

        int even = 0;
        int odd = 0;

        while (true) {
            String input = JOptionPane.showInputDialog("Enter a word or enter \"Stop\" to end: ");
            if (input.equalsIgnoreCase("STOP")) {
                break;
            }
            if (input.length() % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        JOptionPane.showMessageDialog(null, "Number of even words: "
                + even + " Number of odd words: " + odd);
    }
}
