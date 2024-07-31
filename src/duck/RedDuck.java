package duck;

public class RedDuck extends Duck implements Flyable, Quackable {

    public RedDuck(){
        this.color = "\u001B[31m";
    }

    @Override
    public void quack() {
        System.out.print(color + "        ________\n" +
                "   _   |*quack*/\n" +
                "__(.)< |/\n" +
                "\\___)\n");
    }

    @Override
    public void fly() {
        System.out.print(color + "__  _\n" +
                "\\_\\(.)>\n" +
                " \\___)\n");
    }
}
