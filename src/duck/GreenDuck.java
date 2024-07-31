package duck;

public class GreenDuck extends Duck implements Flyable, Quackable {

    public GreenDuck() {
        this.color = "\u001B[32m";
    }

    @Override
    public void quack(){
        System.out.print(color + "        ________\n" +
                "   _   |*quack*/\n" +
                "__(.)< |/\n" +
                "\\___)\n");
    }

    @Override
    public void fly(){
        System.out.print(color + "__  _\n" +
                "\\_\\(.)>\n" +
                " \\___)\n");
    }

}
