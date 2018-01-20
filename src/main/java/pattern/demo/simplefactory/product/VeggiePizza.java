package pattern.demo.simplefactory.product;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Dough";
        sauce = "Sauce";
        toppings.add("Veggie");
    }
}