package pattern.demo.adapter1;

import java.util.ArrayList;

public class Library3SearchEngineAdapter extends Library3SearchEngine implements Searchable {

    public ArrayList<Book> searchByAuthor (String author) {
        ArrayList<Book> books = new ArrayList<>();
        //full implementation of library3 search by author

        System.out.println("Search Library3 by author " + author +". Implemented in Library3SearchEngineAdapter.");
        return books;
    }

    public ArrayList<Book> searchByTitle(String title) {
        char t[] = title.toCharArray();
        return super.titleSearch(t);
    }
}
