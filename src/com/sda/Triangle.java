package com.sda;

public class Triangle extends Shape implements IEditeble, IResizebile {
    int base;
    int height;


    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;

    }

    public Triangle(int base, int height, String text, String material) {
        super(text, material); // cheama constructorul sau metoda din clasa pe care o extind
        // this(base,height);
        // apeleaza constructorul din clasa curenta
        this.base = base;
        this.height = height;
    }

    public double getSize() {
        return (base * height) / 2;

    }

//    //public void displayTriangleHeight(){
//        System.out.println("Triangle Height is: " + this.height);
//    }

    @Override
    public void displayHeight() {
        System.out.println("Triangle Height is: " + this.height);

    }

    @Override
    public void upDateText(String text) {
        this.text = text;
    }

    @Override
    public void changeMaterial(String material) {
        this.material = material;

    }

    @Override
    public void resize(int size) {
        this.height = height - size;
        this.base = base - size;

    }
}

