package pattern.demo.adapter1;

import java.util.ArrayList;

public class Library3SearchEngine {
    public void recall () {
        //specific function in library 3
    }

    public ArrayList<Book> searchByCallNumber(String callNum) {
        ArrayList<Book> books = new ArrayList<>();
        //implementation of library3 search by callNumber

        System.out.println("Search Library3 by callNumber callNum" + callNum + ". Implementation in Library3SearchEngine.");
        return books;
    }

    public ArrayList<Book> titleSearch(char[] title) {
        ArrayList<Book> books = new ArrayList<>();
        //implementation of library3 search by title

        System.out.println("Search Library3 by title " + String.valueOf(title) + ". Implementation in Library3SearchEngine.");
        return books;
    }
}
