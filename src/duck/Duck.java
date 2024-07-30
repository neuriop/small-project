package duck;

public class Duck {
    protected String color = "\u001B[0m";

    public void duck() {
        System.out.print(color + "   _\n" +
                "__(.)>\n" +
                "\\___)\n");
    }

    public void quack() {
        System.out.print(color + "        ________\n" +
                "   _   |*quack*/\n" +
                "__(.)> |/\n" +
                "\\___)\n");
    }

    public void swim() {
        System.out.print(color + "            _\n" +
                "         __(.)>\n" +
                "_ _ _ _ _\\___)\n");
    }

    public void fly() {
        System.out.print(color + "__  _\n" +
                "\\_\\(.)>\n" +
                " \\___)\n");
    }
}
