package pattern.demo.factorymethod.product;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Chicago Style Clam");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}