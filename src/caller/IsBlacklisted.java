package caller;

import java.util.ArrayList;
import java.util.List;

public class IsBlacklisted implements Observer {
    private static List<String> numbers = new ArrayList<>();
    private String number;

    @Override
    public void update(String number) {
        this.number = number;

    }

    @Override
    public boolean condition() {
        if (numbers.contains(number)) {
            System.out.println("Number is blacklisted; ");
            return false;
        } else return true;
    }

    public static void addNumber(String number) {
        if (!numbers.contains(number))
            numbers.add(number);
    }

    public static void removeNumber(String number) {
        numbers.remove(number);
    }

}
