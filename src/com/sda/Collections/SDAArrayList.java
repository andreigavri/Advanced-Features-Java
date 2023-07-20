package com.sda.Collections;

public class SDAArrayList<T> {
    private static final int INITIAL_CAPACITY = 7; // Constanta
    private Object[] arrayList;

    private int size = 0; // numara numarule de elemente din array

    public SDAArrayList() {
        this.arrayList = new Object[INITIAL_CAPACITY]; //
    }

    public void add(T element) {
        if (size == arrayList.length) { // atunci crestem capacitatea vectoriului pentru ca am atins numarul maxim de elemente
        } else {
            arrayList[size] = element;
            size++;
        }
    }

    public T remove(int index) { // prin aceasta metoda stergem un numar depe pozitia index
        if (index < 0 || index >= size) {//scot pozitia elementul // sa nu fie in afara array ului sau mai mare
            throw new IndexOutOfBoundsException("Invalid index ");
        }
        Object removeElement = arrayList[index]; //mutare elemente
        for (int i = index; i < size - 1; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        size--;
        return (T) removeElement;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index ");

        }
        return (T) arrayList[index];
    }

    public void display() {
        for (Object element : arrayList) {
            System.out.println("Element : " + element);
        }
    }
}
