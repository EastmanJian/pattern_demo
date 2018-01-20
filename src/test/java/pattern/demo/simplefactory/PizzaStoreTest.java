package pattern.demo.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jiany on 2018-01-20.
 */
public class PizzaStoreTest {
    @Test
    public void testOrderPizza() throws Exception {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("pepperoni");
    }

}