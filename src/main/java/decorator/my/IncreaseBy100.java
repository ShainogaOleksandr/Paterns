package decorator.my;

public class IncreaseBy100 extends Calculator {
    Calculator calculator;

    public IncreaseBy100(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double generateNumber() {
        return 100 + calculator.generateNumber();
    }
}
