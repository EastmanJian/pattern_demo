package pattern.demo.decorator;

public abstract class PayCalculatorDecorator implements PayCalculator {
    private PayCalculator decoratee;

    public PayCalculatorDecorator (PayCalculator decoratee) {
        this.decoratee = decoratee;
    }

    public void calculatePay() {
        System.out.println("PayCalculatorDecorator invokes decoratee(" + decoratee.getClass().getName() + ")'s method calculatePay()");
        decoratee.calculatePay();
    }
}
