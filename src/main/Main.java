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
    }
}
