package pattern.demo.adapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Library3SearchEngineClassStrategyAdapterTest {
    @Test
    public void searchByCallNumber() throws Exception {
        Searchable searchLib = new Library3SearchEngineAdapter();
        searchLib.searchByCallNumber("50935");
        searchLib.searchByAuthor("Endora");
        searchLib.searchByTitle("Gone with the wind");
    }

}