package observer;

public class Dog implements Observer {
    public void update(String string) {
        System.out.println("Dog: "+ string);
    }
}
