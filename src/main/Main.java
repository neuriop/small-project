package main;

import duck.*;

public class Main {
    public static void main(String[] args) {
        GreenDuck greenDuck = new GreenDuck();
        greenDuck.duck();
        greenDuck.quack();
        greenDuck.swim();
        greenDuck.fly();
        BlueDuck blueDuck = new BlueDuck();
        blueDuck.duck();
        blueDuck.quack();
        blueDuck.swim();
        blueDuck.fly();
        RedDuck redDuck = new RedDuck();
        redDuck.duck();
        redDuck.quack();
        redDuck.swim();
        redDuck.fly();
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.duck();
        rubberDuck.quack();
        rubberDuck.swim();
    }
}
