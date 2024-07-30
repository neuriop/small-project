package duck;

public class RubberDuck extends Duck {

    public RubberDuck(){
        this.color = "\u001B[33m";
    }

    @Override
    public void quack() {
        System.out.print(color + "        ________\n" +
                "   _   |*squeak*/\n" +
                "__(.)> |/\n" +
                "\\___)\n");
    }


    @Override
    public void fly() {}
}
