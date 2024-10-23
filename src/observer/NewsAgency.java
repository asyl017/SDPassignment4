package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Observable {

    private String headline;
    List<Observer> observers = new ArrayList<>();

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(headline);
        }
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }
}
