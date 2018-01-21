package pattern.demo.composite;

public class Clerk implements Employee {
    private double basePayRate = 3000;
    private double individualBonus = Math.random() * 1000; //demo
    private int overtimeHours = (int) (Math.random() * 3000); //demo
    private String name;

    public Clerk (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculatePay() {
        double pay = basePayRate + individualBonus + overtimeHours;// ... calculate individual pay
        System.out.println("Clerk " + name + "'s individual pay is " + pay + ".");
        return pay;
    }

    public double calculateDeptPay() {
        return calculatePay();
    }

}