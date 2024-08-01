package duck;

import duck.duckbehaviour.Duck;
import duck.duckbehaviour.flight.Flight;
import duck.duckbehaviour.quack.CannotQuack;
import utils.Colors;

public class DroneDuck extends Duck {
    public DroneDuck() {
        this.colorHead = Colors.colorWhite;
        this.colorBody = Colors.colorWhite;
        flightBehaviour = new Flight(colorHead, colorBody);
        quackBehaviour = new CannotQuack();
    }
}
