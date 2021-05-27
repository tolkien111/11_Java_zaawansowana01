package com.sda.typygeneryczne.zadania.zadanie4;

public class Book extends ObjectCreator{
    private String writer;


    public Book(String title, String writer) {
        super(title);
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "writer='" + writer + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
