package com.sda.kolekcje.zadania.zadanie2;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class Book  implements  Comparable <Book>{
    private String title;
    private float price;
    private int yearOfPublishing;
    private List <Author> authorsList;
    private Genre genre;

    public Book(String title, float price, int yearOfPublishing, List<Author> authorsList, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfPublishing = yearOfPublishing;
        this.authorsList = authorsList;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public List<Author> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(List<Author> authorsList) {
        this.authorsList = authorsList;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Float.compare(book.price, price) == 0 &&
                yearOfPublishing == book.yearOfPublishing &&
                title.equals(book.title) && authorsList.equals(book.authorsList) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfPublishing, authorsList, genre);
    }

    @Override
    public String toString() {
        return  "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublishing=" + yearOfPublishing +
                ", authorsList=" + authorsList +
                ", genre=" + genre +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.getTitle()); //inaczej niż w odpowiedziach -> o.getTitle().compareTo(title) - w takim wypadku sortuje od z do a
    }
}

