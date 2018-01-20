package pattern.demo.simplefactory.product;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Dough";
        sauce = "Sauce";
        toppings.add("Pepperoni");
    }
}