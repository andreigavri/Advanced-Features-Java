package com.sda.generics;

public class Movie extends  MediaTitle{
    private String producer;

    public Movie(String producer, String title) {
        super(title);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "producer='" + producer  + " , " + super.toString() + " }";
    }
}
