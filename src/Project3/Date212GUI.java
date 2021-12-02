package Project3;

import javax.swing.*;
import java.awt.*;

public class Date212GUI {

    TextArea unsortedDates, sortedDates;

    public Date212GUI() {

        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));
        frame.setTitle("Project 3");
        unsortedDates = new TextArea();
        sortedDates = new TextArea();
        frame.getContentPane().add(unsortedDates);
        frame.getContentPane().add(sortedDates);
        frame.setVisible(true);
    }
}
