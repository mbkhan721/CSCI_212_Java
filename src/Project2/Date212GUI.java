package Project2;

// Muhammad Khan
// Project 2
// CSCI 212 11

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.TextArea;
public class Date212GUI {

    TextArea unsortedDates, sortedDates;

    public Date212GUI() {

        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));
        frame.setTitle("Project 2");
        unsortedDates = new TextArea();
        sortedDates = new TextArea();
        frame.getContentPane().add(unsortedDates);
        frame.getContentPane().add(sortedDates);
        frame.setVisible(true);

    }
}