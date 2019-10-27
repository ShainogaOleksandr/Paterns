package decorator.my;

public class DevideOrMultiplyDecoreator extends Calculator{
    Calculator calculator;

    public DevideOrMultiplyDecoreator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double generateNumber() {
        if (getStartNumber()<0.5){
        return calculator.generateNumber()*2;}
        else return calculator.generateNumber()/2;
    }
}
