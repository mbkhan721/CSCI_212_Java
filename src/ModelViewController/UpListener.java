package ModelViewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpListener implements ActionListener {

    TemperatureModel model;

    public UpListener(TemperatureModel m) {
        model = m;
    }

    public void actionPerformed(ActionEvent e) {
        model.setF(model.getF() + 1.0);
    }
}
