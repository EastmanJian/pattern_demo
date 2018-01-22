package pattern.demo.iterator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatalogIteratorClientTest {
    @Test
    public void testTraverseCatalogData() throws Exception {
        (new Client()).traverseAllCatalogData();
    }

}