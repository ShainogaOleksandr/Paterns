package observer;

public class Cat implements Observer {
    public void update(String string) {
        if (string.startsWith("A")){
            System.out.println("Cat : I am interested in "+ string);
        }
    }
}
