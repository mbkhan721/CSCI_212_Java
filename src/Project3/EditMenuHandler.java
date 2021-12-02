package Project3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditMenuHandler implements ActionListener {

    JFrame jFrame;

    public EditMenuHandler(JFrame jf) {
        jFrame = jf;
    }

    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();

        if (menuName.equals("Open"))
            JOptionPane.showMessageDialog(null, "You clicked Find");

        else if (menuName.equals("Replace"))
            JOptionPane.showMessageDialog(null, "You clicked Replace");

    }
}
