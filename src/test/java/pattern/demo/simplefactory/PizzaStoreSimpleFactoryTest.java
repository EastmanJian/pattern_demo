package pattern.demo.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test Simple Factory Pattern at the PizzaStore
 */
public class PizzaStoreSimpleFactoryTest {
    @Test
    public void testOrderPizza() throws Exception {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("pepperoni");
    }

}