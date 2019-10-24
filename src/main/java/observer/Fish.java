package observer;

public class Fish implements Observer {
    public void update(String string) {
        System.out.println("Fish"+ string);
    }
}
