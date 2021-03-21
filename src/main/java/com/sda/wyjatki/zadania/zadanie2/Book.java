package com.sda.wyjatki.zadania.zadanie2;

public class Book {
    private String isbn;
    private String author;
    private String title;
    private int yearOfPublishment;

    public Book(String isbn, String author, String title, int yearOfPublishment) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.yearOfPublishment = yearOfPublishment;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishment() {
        return yearOfPublishment;
    }

    public void setYearOfPublishment(short yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublishment=" + yearOfPublishment +
                '}';
    }
}
