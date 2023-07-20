package com.sda.EX3;

public class Movie {
    private String title;
    private String director;
    private int year;
    private String genre;
    private String distribuitor;

    public Movie() {

    }

    public Movie(String title, String director, int year, String genre, String distribuitor) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.distribuitor = distribuitor;
    }

    String getTitile() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;

    }

    String getDirector() {
        return this.director;
    }

    void setDirector(String director) {
        this.director = director;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int year) {
        this.year = year;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistribuitor() {
        return distribuitor;
    }

    public void setDistribuitor(String distribuitor) {
        this.distribuitor = distribuitor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", distribuitor='" + distribuitor + '\'' +
                '}';
    }

    static class MovieCreator { // are cumva legatura cu Movie (clasa)  dar nu e legata de un obiect // clasa intr 0 alta clasa

        private String title;
        private String director;
        private int year;
        private String genre;
        private String distribuitor;


        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;

        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setYear(int year) {
            this.year = year;
            return this;


        }

        public MovieCreator setGenre(String genre) {
            this.genre = genre;
            return this;

        }

        public MovieCreator setDistribuitor(String distribuitor) {
            this.distribuitor = distribuitor;
            return this;
        }

        public Movie createMovie() {

            Movie numeMovie = new Movie(this.title, this.director, this.year, this.genre, this.distribuitor);
            return numeMovie;

        }
    }
}
