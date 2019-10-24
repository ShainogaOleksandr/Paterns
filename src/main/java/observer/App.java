package observer;

public class App {
    public static void main(String[] args) {
        Cat c1= new Cat();
        Dog d1= new Dog();
        Fish f1=new Fish();

        Subject subject= new SimpleSubject();

        subject.addObserver(c1);
        subject.updateObservers("Africa");

        subject.addObserver(d1);
        subject.addObserver(f1);
        subject.updateObservers("Bla Bla");

        subject.removeObserver(d1);
        subject.updateObservers("Bla -2 Bla -2 ");
    }
}
