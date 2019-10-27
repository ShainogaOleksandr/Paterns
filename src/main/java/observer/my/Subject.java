package observer.my;

public interface Subject {
     void addObserver(Observer observer);
     void removeObserver(Observer observer);
     void updateObservers(String s);
}
