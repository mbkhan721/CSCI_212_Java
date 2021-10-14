package Lab11;

import java.awt.GridLayout;
import javax.swing.*;

public class Lab11 {

    public static void main(String[] args) {
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Lab 11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 100,100);//width, height);
        frame.setLocation(200,200);//x, y);
        frame.setLayout(new GridLayout(2,1));

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);
        JLabel label = new JLabel("The sum of the numbers in the matrix is: ");
        frame.getContentPane().add(label);

        //textArea.setText("The matrix should print here");

        //Display the window.
        frame.pack();
        frame.setVisible(true);

        readAndDisplayMatrix(frame, textArea, label);
    }

    private static void readAndDisplayMatrix(JFrame myFrame, JTextArea myText,
                                             JLabel myLabel) {

        int[][] myMatrix = {{1,2,3},{4,5,6},{7,8,9}};

        int sum = 0;
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                myText.append(myMatrix[i][j] + " ");
                sum += myMatrix[i][j];
            }
            myText.append("\n");
        }
        myLabel.setText("Sum is: " + sum);

        // Step 1: iterate the matrix and calculate the sum - save everything in String val
        // String S1 = "hello", s2 = "World", s3 = s1+s2

        // Step 2: set the text for the text area
        // Step 3: set the label
        // Step 4: Make it visible

    }
}