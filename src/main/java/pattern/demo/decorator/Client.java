package pattern.demo.decorator;

public class Client {
    public void calculateCanadianPay () {
        PayCalculator calc1 = new BasePayCalculator();
        PayCalculator calc2 = new RetirementFundCalculator(calc1);
        PayCalculator calc3 = new CanadianTaxCalculator(calc2);
        calc3.calculatePay();
        System.out.println("Canadian pay calculation done.");
    }
}
