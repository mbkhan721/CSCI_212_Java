package ModelViewController;

import java.util.Observable;

public class CelsiusGUI extends TemperatureGUI {

    public CelsiusGUI(TemperatureModel model, int h, int v) {
        super("Celsius Temperature", model, h, v);
        setDisplay("" + model().getC());
        addUpListener(new UpListener(model));
        addDownListener(new DownListener(model));
        addDisplayListener(new DisplayListener(model));
    }

    @Override
    public void update(Observable o, Object arg) {
        setDisplay("" + model().getC());
    }
}
