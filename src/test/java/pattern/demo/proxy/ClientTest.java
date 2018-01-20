package pattern.demo.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    @Test
    public void displayRoomImage() throws Exception {
        Client client = new Client();
        client.displayRoomImage();
    }

}