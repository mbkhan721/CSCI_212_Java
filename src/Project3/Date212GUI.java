package Project3;
import javax.swing.*;
import java.awt.*;

public class Date212GUI extends JFrame {

    TextArea sortedDates, unsortedDates;

    public Date212GUI() {

        setSize(400, 300);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        setTitle("Project 3");
        unsortedDates = new TextArea("Unsorted: " + "\n");
        sortedDates = new TextArea("Sorted: " + "\n");
        getContentPane().add(unsortedDates);
        getContentPane().add(sortedDates);
        createFileMenu();
        pack();
        setVisible(true);
    }

    private void createFileMenu() {
        JMenu FileMenu = new JMenu("File");
        JMenuBar menuBar = new JMenuBar();

        JMenuItem item = new JMenuItem("Open");
        FileMenuHandler fmh = new FileMenuHandler(this);
        item.addActionListener(fmh);
        FileMenu.add(item);
        FileMenu.addSeparator();

        item = new JMenuItem("Quit");
        item.addActionListener(fmh);
        FileMenu.add(item);
        setJMenuBar(menuBar);
    }
}
