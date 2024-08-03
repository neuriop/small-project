package weatherstation.observers;

import utils.Colors;
import weatherstation.Observer;

public class CurrentMeasurements implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void displayMeasurements(){
        System.out.println("Current Temp: " + Colors.colorRed + temperature + Colors.colorDefault +
                "\nCurrent humid: " + Colors.colorBlue + humidity + Colors.colorDefault +
                "\nCurrent press: " + Colors.colorGreen + pressure + Colors.colorDefault);
    }

}
