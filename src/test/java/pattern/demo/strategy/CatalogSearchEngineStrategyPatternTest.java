package pattern.demo.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatalogSearchEngineStrategyPatternTest {
    @Test
    public void testSearch() throws Exception {
        CatalogSearchEngine engine = new CatalogSearchEngine(new QuickSort());
        engine.search();
    }

}