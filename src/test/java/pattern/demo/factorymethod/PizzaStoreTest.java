package pattern.demo.factorymethod;

import org.junit.Test;
import pattern.demo.factorymethod.product.Pizza;

import static org.junit.Assert.*;

/**
 * Test Factory Method Pattern at the PizzaStore
 */
public class PizzaStoreTest {
    @Test
    public void testOrderPizza() throws Exception {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

}