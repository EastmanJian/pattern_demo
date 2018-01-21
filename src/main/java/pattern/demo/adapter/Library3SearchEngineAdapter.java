package pattern.demo.adapter;

import java.util.ArrayList;

public class Library3SearchEngineAdapter implements Searchable {
    private Library3SearchEngine adaptee = new Library3SearchEngine();

    public ArrayList<Book> searchByAuthor (String author) {
        ArrayList<Book> books = new ArrayList<>();
        //full implementation of library3 search by author

        return books;
    }

    public ArrayList<Book> searchByCallNumber(String callNum) {
        return adaptee.searchByCallNumber(callNum);
    }

    public ArrayList<Book> searchByTitle(String title) {
        char t[] = title.toCharArray();
        return adaptee.titleSearch(t);
    }
}
