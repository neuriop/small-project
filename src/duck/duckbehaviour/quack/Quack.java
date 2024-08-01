package duck.duckbehaviour.quack;

import duck.duckbehaviour.Duck;
import utils.Colors;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println(Colors.colorDefault + "        _________\n" +
                "   _   | *quack* /\n" +
                "__(.)< |/\n" + // Дотати сюди колір голови
                "\\___)\n"); // Дотати сюди колір тіла
    }
}

