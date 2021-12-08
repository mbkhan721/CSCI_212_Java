package ModelViewController;

public class FarenheitGUI extends TemperatureGUI {

    public FarenheitGUI(TemperatureModel model, int h, int v) {
        super("Fahrenheit Temperature", model, h, v);
        setDisplay("" + model.getF());
    }
}
