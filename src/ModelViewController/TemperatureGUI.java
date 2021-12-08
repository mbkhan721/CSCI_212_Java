package ModelViewController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class TemperatureGUI implements java.util.Observer {

    private String label;
    private TemperatureModel model;
    private Frame temperatureFrame;
    private TextField display = new TextField();
    private Button upButton = new Button("Raise");
    private Button downButton = new Button("Lower");

    TemperatureGUI(String theLabel, TemperatureModel tModel, int h, int v) {
        label = theLabel;
        model = tModel;
        temperatureFrame = new Frame(label);
        temperatureFrame.add("North", new Label(label));
        temperatureFrame.add("Center", display);
        Panel buttons = new Panel();
        buttons.add(upButton);
        buttons.add(downButton);
        temperatureFrame.add("South", buttons);
        temperatureFrame.addWindowListener(new CloseListener());

        model.addObserver(this);
        temperatureFrame.setSize(200, 100);
        temperatureFrame.setLocation(h, v);
        temperatureFrame.setVisible(true);
    }

    public void setDisplay(String s) {
        display.setText(s);
    }

    public double getDisplay() {
        return Double.valueOf(display.getText()).doubleValue();
    }

    public void addDisplayListener(ActionListener a) {
        display.addActionListener(a);
    }

    public void addUpListener(ActionListener a) {
        upButton.addActionListener(a);
    }

    public void addDownListener(ActionListener a) {
        downButton.addActionListener(a);
    }

    public void actionPerformed(ActionEvent e) {
        double value = fg.getDisplay();
        model.setF(value);
    }
}
