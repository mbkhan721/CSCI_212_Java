package Project3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener {
    JFrame jframe;
    static ArrayList<Date212> unsorted = new ArrayList<>();
    static ArrayList<Date212> sorted = new ArrayList<>();
    public FileMenuHandler(JFrame jf) {
        jframe = jf;
    }

    public void fileOpen() {
        Scanner f;
        f = new Scanner(new File(fileName));
        String line;
        while (f.hasNextLine()) {
            line = f.nextLine();
            StringTokenizer tokens = new StringTokenizer(line, ",");
            while (tokens.hasMoreTokens()) {
                String inStr = tokens.nextToken();
                Date212 date = new Date212(inStr);
                unsorted.add(date);
                //sorted.add(date);
            }
    }

    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if (menuName.equals("Open")) {
            fileOpen();
            System.out.println(unsorted);

        }
        else if (menuName.equals("Quit"))
            JOptionPane.showMessageDialog(null,"You clicked on Quit");
    } //actionPerformed

}