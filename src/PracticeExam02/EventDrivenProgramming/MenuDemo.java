package PracticeExam02.EventDrivenProgramming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo extends JFrame implements ActionListener {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private final JPanel bluePanel;
    private final JPanel whitePanel;
    private final JPanel redPanel;

    public static void main(String[] args) {

        MenuDemo gui = new MenuDemo();
        gui.setVisible(true);
    }

    public MenuDemo() {

        super("Menu Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3));

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        add(bluePanel);

        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        add(whitePanel);

        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        add(redPanel);

        JMenu colorMenu = new JMenu("Add Colors");

        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(this);
        colorMenu.add(blueChoice);

        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(this);
        colorMenu.add(whiteChoice);

        JMenuItem redPanel = new JMenuItem("Red");
        redPanel.addActionListener(this);
        colorMenu.add(redPanel);

        JMenuBar bar = new JMenuBar();
        bar.add(colorMenu);
        setJMenuBar(bar);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonString = e.getActionCommand();

        String chosenItem = ((MenuItem) e.getSource()).getLabel();
        if (chosenItem.equals( "Pass" )) {
            System.out.println("Hooray! You passed!");
        }
        else if (chosenItem.equals("Succeed")) {            // Answer 1
            System.out.println("Hooray! Your passed!");     // Answer 2
        }
        else if (chosenItem.equals("Fail")) {               // Answer 3
            System.out.println("Sorry! You failed.");       // Answer 4
        }
        else if (chosenItem.equals("Quit")) {               // Answer 5
            System.exit(0);
        }
        else
            System.out.println("Unexpected Error.");
    }
}



















