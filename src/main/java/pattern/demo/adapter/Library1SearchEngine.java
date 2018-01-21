package pattern.demo.adapter;

import java.util.ArrayList;

public class Library1SearchEngine implements Searchable {
    public ArrayList<Book> searchByAuthor (String author) {
        ArrayList<Book> books = new ArrayList<>();
        //implementation of library1 search by author

        return books;
    }

    public ArrayList<Book> searchByCallNumber(String callNum) {
        ArrayList<Book> books = new ArrayList<>();
        //implementation of library1 search by callNumber

        return books;
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> books = new ArrayList<>();
        //implementation of library1 search by title

        return books;
    }
}
