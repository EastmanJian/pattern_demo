package pattern.demo.abstractfactory.product;

import pattern.demo.abstractfactory.PizzaIngredientFactory;

/**
 * Client of the PizzaIngredientFactory
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
    }
}