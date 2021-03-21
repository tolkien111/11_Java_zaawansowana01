package com.sda.wyjatki.zadania.zadanie2;

import java.util.List;
import java.util.UUID;

public class Zadanie2 {
    public static void main(String[] args) throws NoBookFoundException {

        Book firstBook = new Book ("123-2134-231", "Mickiewicz","Pan Tadeusz",  1994);
        Book secondBook = new Book ("122-3134-231", "Slowacki","Ballasyna",  1988);

        BookRepository bookRepository = new BookRepository();
        bookRepository.addition(firstBook);
        bookRepository.addition(secondBook);
        System.out.println(bookRepository);


        List <Book> book = bookRepository.bookSearchByTitle("Pan");
        System.out.println(book);

        Book book2 = bookRepository.bookSearchByIsbn("121-56");
        bookRepository.removal("21421345-2342");





    }
}
