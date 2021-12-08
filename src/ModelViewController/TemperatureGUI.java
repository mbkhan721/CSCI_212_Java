package ModelViewController;

import java.awt.*;
import java.awt.event.*;

abstract class TemperatureGUI implements java.util.Observer {

    private String label;
    private TemperatureModel model;
    private Frame temperatureFrame;
    private TextField display = new TextField();
    private Button upButton = new Button("Raise");
    private Button downButton = new Button("Lower");

    protected TemperatureModel model() {
        return model;
    }

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
        temperatureFrame.setSize(200, 200);
        temperatureFrame.setLocation(h, v);
        temperatureFrame.setVisible(true);
    }

    static class CloseListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false);
            System.exit(0);
        }
    }

    public void setDisplay(String s) {
        display.setText(s);
    }

    public double getDisplay() {
        double result = 0.0;
        try {
            result = Double.valueOf(display.getText()).doubleValue();
        }
        catch (NumberFormatException e) {}
        return result;
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
        double value = getDisplay();
        model.setF(value);
    }
}
