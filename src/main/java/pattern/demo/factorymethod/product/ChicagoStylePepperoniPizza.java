package pattern.demo.factorymethod.product;


public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Chicago Style Pepperoni");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}