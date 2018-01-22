package pattern.demo.iterator;

public class ResultSetWrapper implements CatalogDataSource {
    String resultSet[] = {"ResultSet1", "ResultSet2", "ResultSet3"}; //sample data
    int elementIndex = -1;

    public class ResultSetIterator implements CatalogIterator<String> {

        @Override
        public String currentElement() {
            return (elementIndex >= 0)? resultSet[elementIndex] : null;
        }

        @Override
        public boolean hasMoreElements() {
            return (elementIndex < resultSet.length -1);
        }

        @Override
        public String nextElement() {
            return hasMoreElements()? resultSet[++elementIndex] : null;
        }

        @Override
        public String previousElement() {
            return (elementIndex > 0)? resultSet[--elementIndex] : null;
        }
    }

    @Override
    public CatalogIterator<String> getIterator() {
        return new ResultSetIterator();
    }
}
