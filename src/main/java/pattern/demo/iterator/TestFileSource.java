package pattern.demo.iterator;

public class TestFileSource implements CatalogDataSource {
    String resultSet[] = {"TestFile1", "TestFile2"}; //sample data
    int elementIndex = -1;

    public class TestFileIterator implements CatalogIterator<String> {

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
        return new TestFileIterator();
    }
}
