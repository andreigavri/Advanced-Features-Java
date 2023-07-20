package com.sda.generics.EXacvariu;

import java.util.Arrays;

public class Acvariu <T extends AquaticAnimal> {
    private String description;
    private T[] fishes; // vrem sa avem mai multi pesti / de asta folosim clasa generica cu Array

    public Acvariu(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T[] getFishes() {
        return fishes;
    }

    public void addfishes(T [] fishes){
        this.fishes = fishes;

    }

    public int noFishes(){
        return this.fishes.length;

    }

    @Override
    public String toString() {
        return "Acvariu{" +
                "description='" + description + '\'' +
                ", fishes=" + Arrays.toString(fishes) +
                '}';
    }
}
