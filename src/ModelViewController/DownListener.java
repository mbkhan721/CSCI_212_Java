package ModelViewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DownListener implements ActionListener {

    TemperatureModel model;

    public DownListener(TemperatureModel m) {
        model = m;
    }

    public void actionPerformed(ActionEvent e) {
        model.setF(model.getF() - 1.0);
    }
}
