package decorator.my;

public class App {
    public static void main(String[] args) {
        Calculator c =new Calculator();
        System.out.println(c.generateNumber());

        c= new NegativeDecorator(c);
        System.out.println(c.generateNumber());

        c= new IncreaseBy100(c);
        System.out.println(c.generateNumber());

        c= new DevideOrMultiplyDecoreator(c);
        System.out.println(c.generateNumber());

    }
}
