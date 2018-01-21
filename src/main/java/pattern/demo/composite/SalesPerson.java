package pattern.demo.composite;

public class SalesPerson implements Employee {
    private double basePayRate = 2000;
    private double individualBonus = Math.random() * 3000; //demo
    private int overtimeHours = (int)(Math.random() * 3000); //demo
    private String name;

    public SalesPerson (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateDeptPay() {
        return calculatePay();
    }

    public double calculatePay() {
        double pay = basePayRate + individualBonus + overtimeHours;// ... calculate individual pay
        System.out.println("SalesPerson " + name + "'s individual pay is " + pay + ".");
        return pay;
    }
}