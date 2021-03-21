package com.sda.wyjatki.zadania.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> booksList = new ArrayList<>();

    public void addition(Book book) {
        this.booksList.add(book);
    }

    public void removal(String isbn) throws NoBookFoundException {//usuwanie książki po numerze ISBN z uwagi, książek o tym samym tyule może być więcej
        for (Book book : booksList) {
            if (book.getIsbn().equals(isbn)) {
                this.booksList.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Can't delete. Book with isbn: " + isbn + " was not found");
    }

    public List<Book> bookSearchByTitle(String title) throws NoBookFoundException {//szukanie po tytule książki, może być kilka książek o takim samym tytule
        List<Book> temporaryBookList = new ArrayList<>();//stworzenie listy tymczasowej dla przechowywania znalezionych tytułów

        for (Book book : booksList) {//iterowanie po liście
            if (book.getTitle().equals(title)) {
                temporaryBookList.add(book);

            }
        }
        if (temporaryBookList.isEmpty()) {//sprawdzenie tymczasowej listy, jeżeli jest pusta program rzuci wyjątkiem
            throw new NoBookFoundException("Can't find book with title: " + title);
        }
        return temporaryBookList;
    }

    public Book bookSearchByIsbn(String isbn) throws NoBookFoundException {//sprawdzenie po numerze ISBN
        for (Book book : booksList) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new NoBookFoundException("Can't find book with ISBN: " + isbn);
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "booksList=" + booksList +
                '}';
    }
}
