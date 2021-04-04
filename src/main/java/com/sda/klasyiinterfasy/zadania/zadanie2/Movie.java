package com.sda.klasyiinterfasy.zadania.zadanie2;

public class Movie {
    private String title;
    private String director;
    private int yearOfPublication;
    private String typeOfMovie;
    private String publisher;

    public Movie(String title, String director, int yearOfPublication, String typeOfMovie, String publisher) {
        this.title = title;
        this.director = director;
        this.yearOfPublication = yearOfPublication;
        this.typeOfMovie = typeOfMovie;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getTypeOfMovie() {
        return typeOfMovie;
    }

    public void setTypeOfMovie(String typeOfMovie) {
        this.typeOfMovie = typeOfMovie;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "titel='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", typeOfMovie='" + typeOfMovie + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    static class MovieCreator{
        private String title;
        private String director;
        private int yearOfPublication;
        private String typeOfMovie;
        private String publisher;

        public MovieCreator title (String title){
            this.title = title;
            return this;
        }
        public MovieCreator director (String director){
            this.director = director;
            return this;
        }
        public MovieCreator yearOfPublication (int yearOfPublication){
            this.yearOfPublication = yearOfPublication;
            return this;
        }
        public MovieCreator typeOfMovie (String typeOfMovie){
            this.typeOfMovie = typeOfMovie;
            return this;
        }
        public MovieCreator publisher (String publisher){
            this.publisher = publisher;
            return this;
        }
        public Movie createMovie(){
            Movie movie = new Movie(title, director, yearOfPublication, typeOfMovie, publisher);
            return movie;
        }
    }

}
