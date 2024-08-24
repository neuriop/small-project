package caller;

public class IsSpam implements Observer {
    private String number;

    @Override
    public void update(String number) {
        this.number = number;
    }

    @Override
    public boolean condition() {
        if (number.endsWith("999")) {
            System.out.println("Number is spam; ");
            return false;
        } else return true;
    }
}
