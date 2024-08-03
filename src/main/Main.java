package main;

import duck.*;
import weatherstation.Sensors;
import weatherstation.WeatherStation;
import weatherstation.observers.CurrentMeasurements;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        MallardDuck mallardDuck = new MallardDuck();
//        mallardDuck.duck();
//        mallardDuck.swim();
//        mallardDuck.flight();
//        mallardDuck.quack();
//
//        RedheadDuck redheadDuck = new RedheadDuck();
//        redheadDuck.duck();
//        redheadDuck.swim();
//        redheadDuck.flight();
//        redheadDuck.quack();
//
//        RubberDuck rubberDuck = new RubberDuck();
//        rubberDuck.duck();
//        rubberDuck.swim();
//        rubberDuck.flight();
//        rubberDuck.quack();
//
//        DroneDuck droneDuck = new DroneDuck();
//        droneDuck.duck();
//        droneDuck.swim();
//        droneDuck.flight();
//        droneDuck.quack();
//
//        DecoyDuck decoyDuck = new DecoyDuck();
//        decoyDuck.duck();
//        decoyDuck.swim();
//        decoyDuck.flight();
//        decoyDuck.quack();

// -----------------------------------------------------------

        Sensors sensors = new Sensors();
        WeatherStation weatherStation = new WeatherStation();
        CurrentMeasurements currentMeasurements = new CurrentMeasurements();
        weatherStation.addObserver(currentMeasurements);

        for (int i = 0; i < 50; i++) {
            weatherStation.receiveMeasurements(sensors.getTemperature(), sensors.getHumidity(), sensors.getPressure());
            currentMeasurements.displayMeasurements();
            Thread.sleep(1000, 0);

        }


    }
}
