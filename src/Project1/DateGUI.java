package Project1;

// Muhammad Khan
// Project 1
// CSCI 212 11

import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JFrame;
public class DateGUI {

    TextArea unsortedDates, sortedDates;

    public DateGUI() {

        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));
        frame.setTitle("Project 1");
        unsortedDates = new TextArea();
        sortedDates = new TextArea();
        frame.getContentPane().add(unsortedDates);
        frame.getContentPane().add(sortedDates);
        frame.setVisible(true);

    }
}