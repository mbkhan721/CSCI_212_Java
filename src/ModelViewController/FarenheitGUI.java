package ModelViewController;

import java.util.Observable;

public class FarenheitGUI extends TemperatureGUI {

    public FarenheitGUI(TemperatureModel model, int h, int v) {
        super("Fahrenheit Temperature", model, h, v);
        setDisplay("" + model.getF());
        addUpListener(new UpListener(model));
        addDownListener(new DownListener(model));
        addDisplayListener(new DownListener(model));
    }

    public void update(Observable t, Object o) {
        setDisplay("" + model().getF());
    }
}
