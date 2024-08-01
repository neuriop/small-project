package duck;

import duck.duckbehaviour.Duck;
import duck.duckbehaviour.flight.CannotFly;
import duck.duckbehaviour.quack.Squeak;
import utils.Colors;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.colorHead = Colors.colorYellow;
        this.colorBody = Colors.colorYellow;
        flightBehaviour = new CannotFly();
        quackBehaviour = new Squeak(colorHead, colorBody);
    }
}
