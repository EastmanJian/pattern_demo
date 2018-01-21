package pattern.demo.composite;

import java.util.ArrayList;

public class Manager implements Employee {
    private String name;
    private double basePayRate = 4000;
    private double individualBonus = Math.random() * 1000; //demo
    private int overtimeHours = (int)(Math.random() * 1000); //demo
    private ArrayList<Employee> subordinates = new ArrayList<>();

    public Manager (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);
    }

    public double calculatePay() {
        double pay = basePayRate + individualBonus + overtimeHours;// ... calculate individual pay
        System.out.println("Manager " + name + "'s individual pay is " + pay + ".");
        return pay;
    }

    public double calculateDeptPay() {
        double totalPay = calculatePay();
        for (Employee e: subordinates) { //propagated down the composite hierarchy
            totalPay += e.calculateDeptPay();
        }
        System.out.println("The department total pay under Manager " + name + " is " + totalPay + ".");
        return totalPay;
    }

}