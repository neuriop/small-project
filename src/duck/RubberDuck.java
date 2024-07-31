package duck;

public class RubberDuck extends Duck implements Quackable {

    public RubberDuck(){
        this.color = "\u001B[33m";
    }

    public void quack(){
        System.out.print(color + "        ________\n" +
                "   _   |*squeak*/\n" +
                "__(.)< |/\n" +
                "\\___)\n");
    }

}
