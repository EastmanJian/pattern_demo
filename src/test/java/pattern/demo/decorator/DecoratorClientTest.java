package pattern.demo.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorClientTest {
    @Test
    public void testCalculateCanadianPay() throws Exception {
        (new Client()).calculateCanadianPay();
    }

}