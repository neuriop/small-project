package caller;

public class IsAnotherSpam implements Observer {
    private String number;
    private IsUkrainian ukr = new IsUkrainian();

    @Override
    public void update(String number) {
        this.number = number;
        ukr.update(number);
    }

    @Override
    public boolean condition() {
        if (ukr.condition() && !number.contains("567"))
            return true;
        else {
            System.out.println("Number is also spam; ");
            return false;
        }
    }
}
