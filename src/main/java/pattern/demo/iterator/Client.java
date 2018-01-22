package pattern.demo.iterator;

public class Client {
    private CatalogIterator<String> iter;
    public void traverseAllCatalogData () {
        iter = new ResultSetWrapper().getIterator();
        printData(iter);

        iter = new LegacyDataSource().getIterator();
        printData(iter);

        iter = new TestFileSource().getIterator();
        printData(iter);
    }

    private void printData (CatalogIterator<String> iter) {
        while (iter.hasMoreElements()) {
            System.out.println(iter.nextElement());
        }

    }
}
