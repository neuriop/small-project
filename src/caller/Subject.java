package caller;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void update(String number);
}
