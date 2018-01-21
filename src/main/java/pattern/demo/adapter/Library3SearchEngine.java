package pattern.demo.adapter;

import java.util.ArrayList;

public class Library3SearchEngine {
    public void recall () {
        //specific function in library 3
    }

    public ArrayList<Book> searchByCallNumber(String callNum) {
        ArrayList<Book> books = new ArrayList<>();
        //implementation of library3 search by callNumber

        return books;
    }

    public ArrayList<Book> titleSearch(char[] title) {
        ArrayList<Book> books = new ArrayList<>();
        //implementation of library2 search by title

        return books;
    }
}
