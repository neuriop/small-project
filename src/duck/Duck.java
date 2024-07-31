package duck;

public abstract class Duck {
    protected String color = "\u001B[0m";

    public void duck() {
        System.out.print(color + "   _\n" +
                "__(.)>\n" +
                "\\___)\n");
    }


    public void swim() {
        System.out.print(color + "            _\n" +
                "         __(.)>\n" +
                "_ _ _ _ _\\___)\n");
    }

}
