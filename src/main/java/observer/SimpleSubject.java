package observer;

import java.util.LinkedList;
import java.util.List;

public class SimpleSubject implements Subject{
    private List<Observer> observers= new LinkedList<>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void updateObservers(String info) {
        observers.forEach(observer-> observer.update(info));
    }
}
