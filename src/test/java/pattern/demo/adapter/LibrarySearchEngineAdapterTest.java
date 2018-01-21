package pattern.demo.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibrarySearchEngineAdapterTest {
    @Test
    public void searchByCallNumber() throws Exception {
        Searchable searchLib = new Library3SearchEngineAdapter();
        searchLib.searchByCallNumber("50935");
        searchLib.searchByAuthor("Endora");
        searchLib.searchByTitle("Gone with the wind");
    }

}