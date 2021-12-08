package ModelViewController;

/*
Model - A representation of the data with no concern for how it will appear to the user.
View - Display of the data using GUI components by observing the Model.
Controller - A Listener that responds to events and updates the Model.
For example, push a button to raise the temperature one degree.
 */

import java.text.DecimalFormat;
import java.util.Observable;

public class TemperatureModel extends Observable {

    private double temperatureF = 32.0;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public double getF() {
        return temperatureF;
    }

    public double getC() {
        return Double.parseDouble(df.format((temperatureF - 32.0) * 5.0 / 9.0));
    }

    public void setF(double tempF) {
        temperatureF = tempF;
        setChanged();
        notifyObservers();
    }

    public void setC(double tempC) {
        temperatureF = tempC * 9.0 / 5.0 + 32.0;
        setChanged();
        notifyObservers();
    }
}
