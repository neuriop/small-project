package main;

import duck.*;

public class Main {
    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.duck();
        mallardDuck.swim();
        mallardDuck.flight();
        mallardDuck.quack();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.duck();
        redheadDuck.swim();
        redheadDuck.flight();
        redheadDuck.quack();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.duck();
        rubberDuck.swim();
        rubberDuck.flight();
        rubberDuck.quack();

        DroneDuck droneDuck = new DroneDuck();
        droneDuck.duck();
        droneDuck.swim();
        droneDuck.flight();
        droneDuck.quack();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.duck();
        decoyDuck.swim();
        decoyDuck.flight();
        decoyDuck.quack();
    }
}
