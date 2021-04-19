package com.sda.klasyiinterfasy.zadania.zadanie2;


public class MovieApp {

    public static void main(String[] args) {

        Movie movie = new Movie.MovieCreator()
                .title("Hobbit")
                .director("Peter Jackson")
                .typeOfMovie("Fantasy")
                .yearOfPublication(2011)
                .publisher("Metro-Goldwyn-Mayer")
                .createMovie();

        System.out.println(movie);

    }
}