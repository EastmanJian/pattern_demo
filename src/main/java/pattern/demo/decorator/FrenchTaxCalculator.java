package pattern.demo.decorator;

public class FrenchTaxCalculator extends PayCalculatorDecorator {
    public FrenchTaxCalculator(PayCalculator decoratee) {
        super(decoratee);
    }

    public void calculatePay() {
        System.out.println("Calculating French Tax ... Done.");
        super.calculatePay();
    }
}
