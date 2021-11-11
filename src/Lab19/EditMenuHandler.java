package Lab19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EditMenuHandler implements ActionListener {

    JFrame jFrame;

    public EditMenuHandler(JFrame jf) {
        jFrame = jf;
    }

    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();

        if (menuName.equals("Find"))
            JOptionPane.showMessageDialog(null, "You clicked Find");

        else if (menuName.equals("Replace"))
            JOptionPane.showMessageDialog(null, "You clicked Replace");

    }
}
