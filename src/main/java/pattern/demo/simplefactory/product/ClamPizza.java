package pattern.demo.simplefactory.product;


public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Dough";
        sauce = "Sauce";
        toppings.add("Clam");
    }
}