package weatherstation;

public class Sensors {
    private float temperature;
    private float humidity;
    private float pressure;

    public void randTemperature(){
        float chance = this.temperature / 100 + 0.5f;
        if (Math.random() > chance)
            this.temperature += (float)Math.random();
        else
            this.temperature -= (float)Math.random();
    }

    public void randHumidity(){
        float chance = this.humidity / 100;
        if (Math.random() > chance)
            this.humidity += (float)Math.random();
        else
            this.humidity -= (float)Math.random();
    }

    public void randPressure(){
        float chance = this.pressure / 100;
        if (Math.random() > pressure)
            this.pressure += (float)Math.random();
        else
            this.pressure -= (float)Math.random();
    }

    public float getTemperature() {
        randTemperature();
        return temperature;
    }

    public float getHumidity() {
        randHumidity();
        return humidity;
    }

    public float getPressure() {
        randPressure();
        return pressure;
    }
}



