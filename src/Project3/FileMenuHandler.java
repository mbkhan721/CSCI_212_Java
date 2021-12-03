package Project3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener {

    Date212GUI frame;
    UnsortedDate212List dl;
    SortedDate212List dl2;
    Date212[] dateList;
    int dateSize;
    File inFile;
    String inFileName = "project2.txt";
    JFrame myFrame;
    public StringTokenizer myTokens;

    public FileMenuHandler(Date212GUI jf) {
        frame = jf;

    }// constructor

    /**
     * Checks to see if a command which command is chosen and reacts to the command.
     *
     * @param event
     */
    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if (menuName.equals("Open"))
            openFile();
        else if (menuName.equals("Quit"))
            System.exit(0);
    }// actionPerformed

    /**
     * This method reacts to the "Open" JMenuItem and allows the program to open a
     * selected file
     */
    private void openFile() {
        JFileChooser chooser;
        int status;
        chooser = new JFileChooser();
        status = chooser.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION)
            readSource(chooser.getSelectedFile());
        else
            JOptionPane.showMessageDialog(null, "Open File dialog canceled");
    } // openFile

    /**
     * Once a file is chosen the readSource method takes the file, reads through the
     * dates and appends an unsorted linked list to the left and a sorted linked
     * list of dates to the right.
     *
     * @param <TextFileInput>
     * @param chosenFile
     */
    private void readSource(File chosenFile) {

        myFrame = new JFrame();
        dl = new UnsortedDate212List();
        dl2 = new SortedDate212List();
        TextFileInput inFile = new TextFileInput(chosenFile.getAbsolutePath());
        String date;
        date = inFile.readLine();

        while (date != null) {
            myTokens = new StringTokenizer(date, ",");

            while (myTokens.hasMoreTokens()) {
                String tokens = myTokens.nextToken();
                try {
                    Date212 d = new Date212(tokens);
                    dl.add(d);
                    dl2.add(d);
                } catch (IllegalDate212Exception ide) {
                    System.err.println(ide);
                }
            } // while hasMoreTokens

            myFrame.setVisible(true);
            date = inFile.readLine();

        } // while

        frame.put(dl, dl2);

    }// readSource

    /**
     * Checks date to see if it is an 8 digit number
     *
     * @param String
     * s
     * @return boolean
     */
    public static boolean isValidDate(String s) {

        if (s.length() != 8) {
            return false;
        } // if
        for (int i = 0; i < 8; i++)
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            } // if
        return (true);
    }// isValidDate

}// FileMenuHandler