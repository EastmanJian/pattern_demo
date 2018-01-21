package pattern.demo.decorator;

//can be non-abstract if this top-level decorator will be used standalone
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
