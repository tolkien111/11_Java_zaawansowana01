package com.sda.typygeneryczne.zadania.zadanie4;
//strona 20/27

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
        Library<Book> bookLibrary = new Library<>(new ArrayList<>());
        bookLibrary.getList().add(new Book("Pan Tadeusz", "Adam Mickiewicz"));
        bookLibrary.getList().add(new Book("Władca Pierścieni", "J.R.R Tolkien"));
        System.out.println(bookLibrary);
        System.out.println(bookLibrary.getList());

        System.out.println();

        Library<Newspaper> newspaperLibrary = new Library<>(new ArrayList<>());
        //test
//        List <Newspaper> newList = new ArrayList<>();
//        newspaperLibrary.setList(newList);

        newspaperLibrary.getList().add(new Newspaper("Washington Post", "Clark Kent"));
        newspaperLibrary.getList().add(new Newspaper("New York Times", "Lois Lane"));
        System.out.println(newspaperLibrary);
        System.out.println(newspaperLibrary.getList());
        //test cd.
//        System.out.println(anewList);

        System.out.println();

        Library<Movie> movieLibrary = new Library<>(new ArrayList<>());
        movieLibrary.getList().add(new Movie("Rambo", "Sylvester Stallone"));
        movieLibrary.getList().add(new Movie("Terminator 2", "James Cameron"));
        System.out.println(movieLibrary);
        System.out.println(movieLibrary.getList());
        System.out.println();
        System.out.println();

        //od SDA

        LibrarySDA <Book> bookLibrarySDA = new LibrarySDA<>
                (new  Book[]{new Book ("Pan Tadeusz", "Adam Mickiewicz"), new Book("Władca Pierścieni", "J.R.R Tolkien")});
        System.out.println(Arrays.toString(bookLibrarySDA.getElements()));
    }
}
