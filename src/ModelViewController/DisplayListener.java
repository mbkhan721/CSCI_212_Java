package ModelViewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayListener implements ActionListener {

    TemperatureModel model;
    TemperatureGUI a;

    public DisplayListener(TemperatureModel m) {
        model = m;
    }

    public void actionPerformed(ActionEvent e) {
        double value = a.getDisplay();
        model.setF(value);
    }
}
