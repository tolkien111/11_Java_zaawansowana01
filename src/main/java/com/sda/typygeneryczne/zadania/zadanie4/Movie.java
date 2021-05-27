package com.sda.typygeneryczne.zadania.zadanie4;

public class Movie extends ObjectCreator{
    private String director;

    public Movie(String title, String director) {
        super(title);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
