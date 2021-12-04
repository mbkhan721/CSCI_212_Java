package Project3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener {

    Date212GUI frame;
    UnsortedDate212List unSort;
    SortedDate212List sort;
    JFrame myFrame;
    public StringTokenizer myTokens;

    public FileMenuHandler(Date212GUI jf) { // constructor
        frame = jf;
    }

    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if (menuName.equals("Open"))
            openFile(); // method implemented below
        else if (menuName.equals("Quit"))
            System.exit(0); // exit
    }

    private void openFile() {
        JFileChooser chooser;
        int status;
        chooser = new JFileChooser();
        status = chooser.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION)
            readSource(chooser.getSelectedFile()); // If open selected, getSelectedFile
        else
            JOptionPane.showMessageDialog(null, "Exiting...");
    }

    private void readSource(File chosenFile) {

        myFrame = new JFrame();
        unSort = new UnsortedDate212List();
        sort = new SortedDate212List();
        TextFileInput inFile = new TextFileInput(chosenFile.getAbsolutePath());
        String date;
        date = inFile.readLine();

        while (date != null) {
            myTokens = new StringTokenizer(date, ",");

            while (myTokens.hasMoreTokens()) {
                String tokens = myTokens.nextToken();
                try {
                    Date212 d = new Date212(tokens);
                    unSort.add(d);
                    sort.add(d);
                } catch (IllegalDate212Exception e) {
                    System.err.println(e);
                }
            }
            myFrame.setVisible(true);
            date = inFile.readLine();
        }
        frame.put(unSort, sort);
    }
}