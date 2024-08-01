package duck;

import duck.duckbehaviour.Duck;
import duck.duckbehaviour.flight.CannotFly;
import duck.duckbehaviour.quack.CannotQuack;
import utils.Colors;

import java.awt.*;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.colorHead = Colors.colorBlack;
        this.colorBody = Colors.colorBlack;
        flightBehaviour = new CannotFly();
        quackBehaviour = new CannotQuack();
    }
}
