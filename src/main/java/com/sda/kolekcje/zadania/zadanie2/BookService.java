package com.sda.kolekcje.zadania.zadanie2;

import java.util.*;

public class BookService {

    List <Book> listBook = new ArrayList<>();

    public void addBook(Book book){
        listBook.add(book);
    }
    public void removeBook(Book book){
        listBook.remove(book);
    }

    public List <Book> allBooks (){
        return listBook;
    }

    public List <Book> findBooksGenre(Genre genre){
        List <Book> listFoundBooks = new ArrayList<>();
        for (Book element : listBook){
            if (element.getGenre()==genre){
                listFoundBooks.add(element);
            }
        }
        return listFoundBooks;
    }

}
