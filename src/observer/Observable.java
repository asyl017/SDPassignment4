package observer;

public interface Observable {
    public void notifyObservers();
    public void add(Observer observer);
    public void remove(Observer observer);

}
