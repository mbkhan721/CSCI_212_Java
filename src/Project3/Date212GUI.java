package Project3;

// Muhammad Khan
// Project 2
// CSCI 212 11

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Date212GUI extends JFrame implements ActionListener {

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

        JMenu optionMenu = new JMenu("File");
        JMenuItem openChoice = new JMenuItem("Open");
        openChoice.addActionListener(this);
        optionMenu.add(openChoice);

        JMenuItem quitChoice = new JMenuItem("Quit");
        quitChoice.addActionListener(this);
        optionMenu.add(quitChoice);
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if (action.equals("Open"))
            openFile();
        else if (action.equals("Quit"))
            System.exit(0);
    }
}
