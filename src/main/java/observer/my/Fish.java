package observer.my;

public class Fish implements Observer {
    Subject s;

    public Fish(Subject s) {
        this.s = s;
        s.addObserver(this);
    }

    public void update(String string) {
        System.out.println("Fish"+ string);
    }
}
