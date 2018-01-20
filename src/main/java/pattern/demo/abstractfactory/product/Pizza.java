package pattern.demo.abstractfactory.product;

import pattern.demo.abstractfactory.ingredient.*;


/**
 * Abstract Client of the PizzaIngredientFactory
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    //made the prepare method abstract. This is where we are going to collect the ingredients needed for the pizza,
    //which of course will come from the ingredient factory.
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at OV350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}