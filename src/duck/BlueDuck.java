package duck;

public class BlueDuck extends Duck implements Flyable, Quackable {

    public BlueDuck(){
        this.color = "\u001B[34m";
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
