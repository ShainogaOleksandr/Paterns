package observer.my;

public class Dog implements Observer {
    Subject s;

    public Dog(Subject s) {
        this.s = s;
        s.addObserver(this);
    }

    public void update(String string) {
        System.out.println("Dog: "+ string);
    }
}
