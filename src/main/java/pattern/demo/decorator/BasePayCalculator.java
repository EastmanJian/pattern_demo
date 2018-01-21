package pattern.demo.decorator;

public class BasePayCalculator implements PayCalculator {
    public void calculatePay() {
        System.out.println("Calculating base pay ... Done.");
    }
}
