package pattern.demo.decorator;

public class CanadianTaxCalculator extends PayCalculatorDecorator {
    public CanadianTaxCalculator(PayCalculator decoratee) {
        super(decoratee);
    }

    public void calculatePay() {
        System.out.println("Calculating Canadian Tax ... Done.");
        super.calculatePay();
    }
}
