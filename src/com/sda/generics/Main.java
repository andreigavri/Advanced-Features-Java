package com.sda.generics;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(12, "Mara");
        Pair<String, String> pair2 = new Pair<>("Pere", " Portocale");
        Pair<Boolean, Float> pair3 = new Pair<>(true, 14.5f);
        System.out.println("Prima pereche: " + pair1);
        System.out.println("A doua pereche: " + pair2);
        System.out.println("A treia pereche: " + pair3);

        System.out.println("===============================================");


        Library <Book> books = new Library<>(new Book[]{new Book("Ion Creanga", "Bogatii")});
        Library<Movie> movies= new Library<>(new Movie[]{new Movie("Jonny", "The ghost")});
        Library<Newspaper> newspaper = new Library<>(new Newspaper[]{new Newspaper("Walker", "The Economist")});
        System.out.println(books);
        System.out.println(movies);
        System.out.println(newspaper);
    }
}
