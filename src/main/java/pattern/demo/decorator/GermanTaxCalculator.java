package pattern.demo.decorator;

public class GermanTaxCalculator extends PayCalculatorDecorator {
    public GermanTaxCalculator(PayCalculator decoratee) {
        super(decoratee);
    }

    public void calculatePay() {
        System.out.println("Calculating German Tax ... Done.");
        super.calculatePay();
    }
}
