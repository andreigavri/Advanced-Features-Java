package com.sda.generics;

import java.util.Arrays;

public class Library <T extends MediaTitle> {

    private T[] elements;

    public Library(T[] elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "Library{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
