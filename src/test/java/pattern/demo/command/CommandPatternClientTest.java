package pattern.demo.command;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandPatternClientTest {
    @Test
    public void testUseLibrary() throws Exception {
        (new Client()).useLibrary();
    }

}