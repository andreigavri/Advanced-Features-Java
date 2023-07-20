package com.sda.EX3;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setTitle("Titanic")
                .setDirector("Manuel")
                .setYear(1960)
                .setGenre("drama")
                .setDistribuitor("Paramount")
                .createMovie();

        System.out.println(movie);
    }
}
