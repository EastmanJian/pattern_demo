package pattern.demo.strategy;

import java.util.ArrayList;

public class CatalogSearchEngine {
    private SortStrategy sorter;

    public CatalogSearchEngine(SortStrategy ss) {
        sorter = ss;
    }

    public ArrayList search() {
        ArrayList list = null;
        //perform search

        System.out.println("Searching catalog... Done.");

        sorter.sort(list);
        return list;
    }

}
