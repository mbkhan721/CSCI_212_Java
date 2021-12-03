package Project3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener {

    private final Date212GUI gui;

    public FileMenuHandler(Date212GUI gui) {
        this.gui = gui;
    }

    public void actionPerformed (ActionEvent event){
        String menuName = event.getActionCommand();
        if (menuName.equals("Open")) {
            fileOpen();
        } else if (menuName.equals("Quit"))
            System.exit(0);
    } //actionPerformed

    private void fileOpen() {
        JFileChooser chooser = new JFileChooser();
        int status = chooser.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION)
            readSource(chooser.getSelectedFile());
    }

    private void readSource(File chosenFile) {
        Scanner reader;
        Date212List unsorted = new UnsortedDate212List();
        Date212List sorted = new SortedDate212List();

        try {
            reader = new Scanner(chosenFile);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                StringTokenizer token = new StringTokenizer(line, ", ");
                while (token.hasMoreTokens()) {
                    Date212 dataObject = new Date212(token.nextToken());
                    System.out.println(dataObject.toString());
                    unsorted.add(dataObject);
                    sorted.add(dataObject);
                }
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found. " + ex.getMessage());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Date contained non-number chars. " + nfe.getMessage());
        }
        finally {
            gui.unsortedDates.append(unsorted.toString());
            gui.sortedDates.append(sorted.printString());
        }
    }
}