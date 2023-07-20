package com.sda.generics;

public class Book extends MediaTitle {

    private String autor;

    public String getAutor() {
        return autor;
    }

    public Book(String autor, String title) {
        super(title);
        this.autor = autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + " , " + super.toString() + " }";
    }
}
