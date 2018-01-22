package pattern.demo.iterator;

public interface CatalogIterator<E> {
    E currentElement();
    boolean hasMoreElements();
    E nextElement();
    E previousElement();
}
