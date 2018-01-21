package pattern.demo.composite;

public class Concierge implements Employee {
    private double basePayRate = 3500;
    private double individualBonus = Math.random() * 800; //demo
    private int overtimeHours = (int) (Math.random() * 3000); //demo
    private String name;

    public Concierge (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculatePay() {
        double pay = basePayRate + individualBonus + overtimeHours;// ... calculate individual pay
        System.out.println("Concierge " + name + "'s individual pay is " + pay + ".");
        return pay;
    }

    public double calculateDeptPay() {
        return calculatePay();
    }
}