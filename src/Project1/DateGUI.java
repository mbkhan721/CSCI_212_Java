package Project1;

// Muhammad Khan
// Project 1
// CSCI 212 11

import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JFrame;
public class DateGUI
{
    //declare JFrame class
    JFrame guidates;
    //declare TextArea class
    TextArea unsortedDates, sortedDates;

    public DateGUI()
    {

        guidates = new JFrame();
        guidates.setSize(400, 300);
        guidates.setLocation(200, 200);
        guidates.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guidates.setLayout(new GridLayout(1, 2));
        guidates.setTitle("Project 1");
        unsortedDates = new TextArea();
        sortedDates = new TextArea();
        guidates.getContentPane().add(unsortedDates);
        guidates.getContentPane().add(sortedDates);
        guidates.setVisible(true);

    }
}