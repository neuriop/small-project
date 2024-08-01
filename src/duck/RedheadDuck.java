package duck;

import duck.duckbehaviour.Duck;
import duck.duckbehaviour.flight.Flight;
import duck.duckbehaviour.quack.Quack;
import utils.Colors;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.colorHead = Colors.colorRed;
        this.colorBody = Colors.colorBlack;
        flightBehaviour = new Flight(colorHead, colorBody);
        quackBehaviour = new Quack(colorHead, colorBody);
    }
}
