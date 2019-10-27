package observer.my;

public class Cat implements Observer {
    Subject s;

    public Cat(Subject s) {
        this.s = s;
        s.addObserver(this);
    }

    public void update(String string) {
        if (string.startsWith("A")){
            System.out.println("Cat : I am interested in "+ string);
        }
    }
}
