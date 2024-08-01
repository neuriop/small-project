package duck.duckbehaviour.quack;

import utils.Colors;

public class Squeak implements QuackBehaviour {
    private String colorHead;
    private String colorBody;

    public Squeak(String colorHead, String colorBody) {
        this.colorHead = colorHead;
        this.colorBody = colorBody;
    }

    @Override
    public void quack() {
        System.out.println(Colors.colorDefault + "        _________\n" +
                colorHead + "   _   " + Colors.colorDefault + "|*squeak*/\n" +
                colorBody + "__" + colorHead + "(.)< " + Colors.colorDefault + "|/\n" +
                colorBody + "\\___)\n");
    }
}
