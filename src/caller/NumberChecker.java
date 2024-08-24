package caller;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class NumberChecker implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public NumberChecker() {
        observers.add(new IsUkrainian());
        observers.add(new IsBlacklisted());
        observers.add(new IsSpam());
        observers.add(new IsAnotherSpam());
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void update(String number) {
        for (Observer observer : observers)
            observer.update(number);
    }

    public void call(String number) {
        int day = dayOfTheWeek(ZonedDateTime.now().getYear(), ZonedDateTime.now().getMonthValue(), ZonedDateTime.now().getDayOfMonth());
        update(number);
        boolean can = true;
        switch (day) {
            case 1:
                if (observers.get(0).condition() && observers.get(1).condition())
                    System.out.println("Can call.");
                break;
            case 2:
                if (observers.get(1).condition() && observers.get(2).condition())
                    System.out.println("Can call.");
                break;
            case 3:
                if (observers.get(2).condition() && observers.get(3).condition())
                    System.out.println("Can call.");
                break;
            case 4:
                if (observers.get(3).condition() && observers.get(0).condition())
                    System.out.println("Can call.");
                break;
            case 5:
                if (observers.get(0).condition() && observers.get(2).condition())
                    System.out.println("Can call.");
                break;
            case 6:
                if (observers.get(1).condition() && observers.get(3).condition())
                    System.out.println("Can call.");
                break;
            case 7:
                for (Observer observer : observers)
                    if (!observer.condition())
                        can = false;
                if (can)
                    System.out.println("Can call.");
        }

    }

    private int dayOfTheWeek(int year, int month, int day) {
        int[] monthKey = {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
        int last2digits = year % 100;
        int l2dQuarter = last2digits / 4;
        int keyMonth;
        if (month - 1 == 0)
            keyMonth = 0;
        else if (month - 1 == 1)
            keyMonth = 3;
        else keyMonth = monthKey[month - 1];

        int sum = ((last2digits + l2dQuarter + keyMonth + day) % 7) - 2;
        if (sum == -2)
            sum = 5;
        else if (sum == -1)
            sum = 6;
        else if (sum == 0)
            sum = 7;
        return sum;

    }

    private boolean isYearLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private void callAll(String number) {
        boolean can = true;
        update(number);
        for (Observer observer : observers) {
            if (!observer.condition()) {
                can = false;
            }
        }
        if (can)
            System.out.println("Can call this number");
    }

}
