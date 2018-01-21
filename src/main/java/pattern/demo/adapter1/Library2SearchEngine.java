package pattern.demo.adapter1;

import java.util.ArrayList;

public class Library2SearchEngine implements Searchable {
    public ArrayList<Book> searchByAuthor (String author) {
        ArrayList<Book> books = new ArrayList<>();
        //implementation of library2 search by author

        return books;
    }

    public ArrayList<Book> searchByCallNumber(String callNum) {
        ArrayList<Book> books = new ArrayList<>();
        //implementation of library2 search by callNumber

        return books;
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> books = new ArrayList<>();
        //implementation of library2 search by title

        return books;
    }


}
