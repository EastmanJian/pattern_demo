package pattern.demo.decorator;

public class RetirementFundCalculator extends PayCalculatorDecorator {
    public RetirementFundCalculator(PayCalculator decoratee) {
        super(decoratee);
    }

    public void calculatePay() {
        System.out.println("Calculating Retirement Fund ... Done.");
        super.calculatePay();
    }
}
