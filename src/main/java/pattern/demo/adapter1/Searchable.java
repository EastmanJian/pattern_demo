package pattern.demo.adapter1;

import java.util.ArrayList;

public interface Searchable {
    ArrayList<Book> searchByAuthor(String author);
    ArrayList<Book> searchByCallNumber(String callNum);
    ArrayList<Book> searchByTitle(String title);
}
