package caller;

public class IsUkrainian implements Observer {
    private String number;

    @Override
    public void update(String number) {
        this.number = number;
    }

    @Override
    public boolean condition() {
        if (number.startsWith("380"))
            return true;
        else {
            System.out.println("This number is not ukrainian; ");
            return false;
        }
    }
}
