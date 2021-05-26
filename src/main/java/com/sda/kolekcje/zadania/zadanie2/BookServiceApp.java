package com.sda.kolekcje.zadania.zadanie2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class BookServiceApp {
    public static void main(String[] args) {

        Author author01 = new Author("Adam", "Mickiewicz", "male");
        Author author02 = new Author("Ignacy", "Krasicki", "male");
        Author author03 = new Author("Eliza", "Orzeszkowa", "female");

        Book book01 = new Book("b książka", 30f, 1990, Arrays.asList(author01, author02), Genre.ACTION);
        Book book02 = new Book("a książka", 30f, 1995, Arrays.asList(author02, author03), Genre.FANTASY);
        Book book03 = new Book("f książka", 40f, 1998, Collections.singletonList(author02), Genre.THRILLER);
        Book book04 = new Book("d książka", 50f, 1888, Collections.singletonList(author01), Genre.THRILLER);
        Book book05 = new Book("t książka", 60f, 2012, Collections.singletonList(author03), Genre.SFI);
        Book book06 = new Book("c książka", 35f, 1980, Arrays.asList(author01, author02, author03), Genre.SFI);

        BookService bookService = new BookService();

        bookService.addBook(book01);
        bookService.addBook(book02);
        bookService.addBook(book03);
        bookService.addBook(book04);
        bookService.addBook(book05);
        bookService.addBook(book06);
        bookService.removeBook(book03);

        System.out.println();
        System.out.println(bookService.getAllBooks());
        System.out.println();
        System.out.println("1");
        System.out.println(bookService.findBooksBeforeYear(1995));
        System.out.println();
        System.out.println("2");
        System.out.println(bookService.getAllBooks());
        System.out.println();
        System.out.println("BBBB");
        System.out.println(bookService.findMostExpensiveBook());
        System.out.println();
        System.out.println("4");
        System.out.println(bookService.findMCheapestBook());
        System.out.println();
        System.out.println("5");
        System.out.println(bookService.findByNumberOfAuthors(3));
        System.out.println();
        System.out.println("AAAA");
        System.out.println(bookService.sortBookByTitleDecreasingly());
        System.out.println();
        System.out.println("6");
        System.out.println(bookService.sortBookByTitleIncreasingly());
        System.out.println();
        System.out.println("7");
        System.out.println(bookService.getAllBooks());
        System.out.println();
        System.out.println("CCCC");
        System.out.println(bookService.isBookInRepo(book03));
        System.out.println(bookService.isBookInRepo(book04));
        System.out.println();
        System.out.println("8");
        System.out.println(bookService.findBookByAuthor(author01));
        System.out.println("9");
        System.out.println(bookService.uniqueBookMap());
        System.out.println();
        System.out.println("DDDD");
        Stack<Book> bookStack = bookService.makeBookStackAndSortBooksFromHighestPrice();
        while (!bookStack.isEmpty()) {
            System.out.println(bookStack.pop());
        }
//dodatek nie związany z zadaniem, sortowanie listy int
        int[] ia = {99, 11, 7, 21, 4, 2};
        ia = Arrays.stream(ia).
                boxed().
                sorted((a, b) -> b.compareTo(a)).
                mapToInt(i -> i).
                toArray();
        System.out.println(Arrays.toString(ia));
    }

}
