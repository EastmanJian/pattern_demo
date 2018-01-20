package pattern.demo.facade;

import org.junit.Test;

public class ClientTest {
    @Test
    public void testOperates() throws Exception {
        Client client = new Client();
        client.operates();
    }

}