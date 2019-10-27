package decorator.my;

public class NegativeDecorator extends Calculator {
Calculator calculator;
    public NegativeDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double generateNumber() {
        return -1 * calculator.generateNumber();
    }
}
