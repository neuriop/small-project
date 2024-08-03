package duck;

import duck.duckbehaviour.Duck;
import duck.duckbehaviour.flight.Flight;
import duck.duckbehaviour.quack.Quack;
import utils.Colors;

public class MallardDuck extends Duck {

    public MallardDuck(){
        this.colorHead = Colors.colorCyan;
        this.colorBody = Colors.colorWhite;
        flightBehaviour = new Flight(colorHead, colorBody);
        quackBehaviour = new Quack(colorHead, colorBody);
    }

}
