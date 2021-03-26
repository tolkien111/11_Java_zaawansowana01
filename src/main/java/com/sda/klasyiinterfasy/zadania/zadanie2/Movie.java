package com.sda.klasyiinterfasy.zadania.zadanie2;

public class Movie {
    private String titel;
    private String director;
    private int yearOfPublication;
    private String typeOfMovie;
    private String publisher;

    public Movie(String titel, String director, int yearOfPublication, String typeOfMovie, String publisher) {
        this.titel = titel;
        this.director = director;
        this.yearOfPublication = yearOfPublication;
        this.typeOfMovie = typeOfMovie;
        this.publisher = publisher;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
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
                "titel='" + titel + '\'' +
                ", director='" + director + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", typeOfMovie='" + typeOfMovie + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    static class MovieCreator{
        private String titel;
        private String director;
        private int yearOfPublication;
        private String typeOfMovie;
        private String publisher;

        public MovieCreator titel (String titel){
            this.titel = titel;
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
            Movie movie = new Movie(titel, director, yearOfPublication, typeOfMovie, publisher);
            return movie;
        }
    }

}
