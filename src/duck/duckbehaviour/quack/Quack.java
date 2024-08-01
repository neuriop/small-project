package duck.duckbehaviour.quack;

import utils.Colors;

public class Quack implements QuackBehaviour {
    private String colorHead;
    private String colorBody;

    public Quack(String colorHead, String colorBody){
        this.colorHead = colorHead;
        this.colorBody = colorBody;
    }

    @Override
    public void quack() {
        System.out.println(Colors.colorDefault + "        _________\n" +
                colorHead + "   _   " + Colors.colorDefault + "|*quack*/\n" +
                colorBody + "__" + colorHead + "(.)< " + Colors.colorDefault + "|/\n" + // Дотати сюди колір голови
                colorBody + "\\___)\n"); // Дотати сюди колір тіла
    }

}

