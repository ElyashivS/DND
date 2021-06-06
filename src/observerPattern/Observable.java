package observerPattern;

public interface Observable {
    void addObserver(Observer observer);
    void callObserver();
}
