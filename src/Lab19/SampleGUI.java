package Lab19;

import javax.swing.*;
import java.awt.*;
public class SampleGUI extends JFrame {

    public SampleGUI(String title, int height, int width) {
        setTitle(title);
        setSize(height,width);
        setLocation  (400,200);
        createFileMenu();

        createEditMenu();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    } //SSNGUI
    JMenuBar menuBar = new JMenuBar();

    private void createFileMenu( ) {
        JMenuItem   item;

        JMenu       fileMenu = new JMenu("File");
        FileMenuHandler fmh  = new FileMenuHandler(this);

        item = new JMenuItem("Open");    //Open...
        item.addActionListener( fmh );
        fileMenu.add( item );

        fileMenu.addSeparator();           //add a horizontal separator line

        item = new JMenuItem("Quit");       //Quit
        item.addActionListener( fmh );
        fileMenu.add( item );

        setJMenuBar(menuBar);
        menuBar.add(fileMenu);

    } //createMenu

    private void createEditMenu() {
        JMenuItem edit;
        JMenu editMenu = new JMenu("Edit");
        EditMenuHandler emh = new EditMenuHandler(this);

        edit = new JMenuItem("Find"); // find
        edit.addActionListener(emh);
        editMenu.add(edit);

        editMenu.addSeparator();    // interesting, it does HTML work for us

        edit = new JMenuItem("Replace");
        edit.addActionListener(emh);
        editMenu.add(edit);

        setJMenuBar(menuBar);
        menuBar.add(editMenu);

    } // editMenu

} //SSNGUI