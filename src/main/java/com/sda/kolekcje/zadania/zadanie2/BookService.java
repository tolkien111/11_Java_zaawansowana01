package com.sda.kolekcje.zadania.zadanie2;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> listBook = new ArrayList<>();

    public void addBook(Book book) {
        listBook.add(book);
    }

    public void removeBook(Book book) {
        listBook.remove(book);
    }

    public List<Book> getAllBooks() {
        return listBook;
    }

    public List<Book> findBooksGenre(Genre genre) {
        List<Book> listFoundBooks = new ArrayList<>();
        for (Book element : listBook) {
            if (element.getGenre() == genre) {
                listFoundBooks.add(element);
            }
        }
        return listFoundBooks;
    }

    public List<Book> findBooksBeforeYear(int yearOfPublishing) {
        return listBook.stream().filter(book -> book.getYearOfPublishing() < yearOfPublishing).collect(Collectors.toList());
    }

    public List<Book> findMostExpensiveBook() { //w odpowiedziach przypadek dla JEDNEJ najdroższej książki. A co gdyby było więcej książek w tej samej cenie?
        float maxPrice = 0;
        for (Book book : listBook) {
            if (maxPrice == 0 || book.getPrice() > maxPrice) {
                maxPrice = book.getPrice();
            }
        }
        float finalMaxPrice = maxPrice;
        return listBook.stream().filter(book -> book.getPrice() >= finalMaxPrice).collect(Collectors.toList());
    }

    public List<Book> findMCheapestBook() { //analogicznie jak wyżej tylko dla najtańszej książki
        float minPrice = 0;
        for (Book book : listBook) {
            if (minPrice == 0 || book.getPrice() < minPrice) {
                minPrice = book.getPrice();
            }
        }
        float finalMinPrice = minPrice;
        return listBook.stream()
                .filter(book -> book.getPrice() <= finalMinPrice)
                .collect(Collectors.toList());
    }

    public List<Book> findByNumberOfAuthors(int numberOfAuthors) {
        return listBook.stream()
                .filter(book -> book.getAuthorsList().size() >= numberOfAuthors && book.getAuthorsList().size() <= numberOfAuthors)
                .collect(Collectors.toList());
    }

    public List<Book> sortBookByTitleIncreasingly() {
        return listBook.stream()
                .sorted()
                .collect(Collectors.toList());
//        Collections.sort(listBook); // zawarte w odpowiedziach, szczerze bez sensu. Nadpisuje nam starą listę i nie mamy możliwości powrotu do niej
    }

    public List<Book> sortBookByTitleDecreasingly() {
        List<Book> reverseBooks = listBook.stream()
                .sorted()
                .collect(Collectors.toList());
        Collections.reverse(reverseBooks);
//        Collections.reverse(listBook); // BLAD W ODPOWIEDZIACH OD SDA w odpowiedziach jest samo reverse bez sort, jeżeli nie wywołamy sort przed
        //reverse to otrzymamy odwóconą listę a nie POSORTOWANĄ LISTĘ MALEJĄCO. Do tego po sortowaniu/odwróceniu nie mamy dostępu do starej listy
        return reverseBooks;
    }

    public boolean isBookInRepo (Book book){
        return listBook.contains(book);
    }

    public List <Book> findBookByAuthor(Author author){
        List <Book> result = new ArrayList<>();
        for (Book element : listBook){
            if (element.getAuthorsList().contains(author)){
                result.add(element);
            }
        }
        List <Book> result02 = listBook.stream().filter(book -> book.getAuthorsList().contains(author)).collect(Collectors.toList()); //drugie rozwiązanie
        return result;
    }
//Zadanie4
    public Map < Genre, String> uniqueBookMap (){
        Map <Genre, String> uniqueMap = new HashMap<>();
        for (Book book : listBook){
            uniqueMap.put(book.getGenre(), book.getTitle());
        }

    return uniqueMap;
    }

}
