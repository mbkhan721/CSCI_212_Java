package ModelViewController;

public class TempDemo {

    public static void main(String[] args) {
        TemperatureModel temp = new TemperatureModel();
        new FarenheitGUI(temp, 100, 100);
        new CelsiusGUI(temp, 100, 250);
    }
}
