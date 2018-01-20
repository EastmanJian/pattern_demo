package pattern.demo.simplefactory.product;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Dough";
        sauce = "Sauce";
        toppings.add("Cheese");
    }
}