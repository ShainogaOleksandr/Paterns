package observer.my;

public class App {
    public static void main(String[] args) {
        Subject subject= new SimpleSubject();

        Cat c1= new Cat(subject);
        Dog d1= new Dog(subject);
        Fish f1=new Fish(subject);

        subject.updateObservers("Africa");

        subject.updateObservers("Bla Bla");

        subject.updateObservers("Bla -2 Bla -2 ");
    }
}
