package Project1;

// Muhammad Khan
// Project 1
// CSCI 212 11

import javax.swing.*;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

public class DateGUI {

    private JTextArea sorted;
    private JTextArea unsorted;

    public void showGUI() {
        JFrame frame = new JFrame("Project1");
        frame.setPreferredSize(new Dimension(100, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myFrame(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void sorted(String[] text) {
        String dates = "Sorted dates: " + "\n";
        for (String date : text) {
            if (!date.isEmpty())
                dates += date + "\n";
        }
        sorted = new JTextArea(dates);
    }

    public void unsorted(String[] text) {
        String dates = "Unsorted dates: " + "\n";
        for (String date : text) {
            if(!date.isEmpty())
                dates += date + "\n";
        }
        unsorted = new JTextArea(dates);
    }

    private void myFrame(Container container) {
        GridLayout layout = new GridLayout(1, 2);
        container.setLayout(layout);

        container.add(sorted);
        container.add(unsorted);
    }
}
