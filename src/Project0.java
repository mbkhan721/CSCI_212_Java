// Muhammad Khan
// Lab CSSI 212 11

import javax.swing.*;

public class Project0 {
    public static void main(String[] args) {

        String input;
        int upperCase = 0, lowerCase = 0;

        while (true) {

            input = JOptionPane.showInputDialog(null, "Please enter a sentence.");

            if (input.equalsIgnoreCase("STOP"))
                System.exit(0);

            for (int i = 0; i < input.length(); i++) {
                char currentVal = input.charAt(i);
                if (currentVal == 'e') {
                    lowerCase++;
                }
                else if (currentVal == 'E') {
                    upperCase++;
                }
            }

            JOptionPane.showMessageDialog(null, "Number of lowercase e's: " +
                    lowerCase + "\nNumber of uppercase E's: " + upperCase);

            // Resetting the count back to 0 for a new search
            lowerCase = 0;
            upperCase = 0;
        }
    }
}
