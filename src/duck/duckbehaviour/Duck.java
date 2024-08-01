package duck.duckbehaviour;

import duck.duckbehaviour.flight.FlightBehaviour;
import duck.duckbehaviour.quack.QuackBehaviour;
import utils.Colors;

public abstract class Duck {
    protected String colorHead;
    protected String colorBody;
    protected final String colorWater = Colors.colorBlue;
    protected FlightBehaviour flightBehaviour;
    protected QuackBehaviour quackBehaviour;

    public void duck() {
        System.out.println(colorHead + "   _\n" +
                colorBody + "__" + colorHead + "(.)>\n" +
                colorBody + "\\___)\n");
    }

    public void swim() {
        System.out.println(colorHead + "            _\n" +
                colorBody + "         __" + colorHead + "(.)>\n" +
                colorWater + "_ _ _ _ _" + colorBody + "\\___)\n");
    }

    public void flight() {
        flightBehaviour.flight();
    }

    public void quack() {
        quackBehaviour.quack();
    }

}

/*

"   _\n"
"__(.)>\n"
"\\___)\n"

-------------------------

"            _\n"
"         __(.)>\n"
"_ _ _ _ _\\___)\n"

-------------------------

"        _________\n"
"   _   | *quack* /\n"
"__(.)< |/\n"
"\\___)\n"

-------------------------

"__  _\n"
"\\_\\(.)>\n"
" \\___)\n"

 */
