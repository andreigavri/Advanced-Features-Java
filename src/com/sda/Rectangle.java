package com.sda;

public class Rectangle extends Shape implements IResizebile {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int width, int height, String text, String material) {
        super(text, material);
        this.width = width;
        this.height = height;

    }
    public double getSize(){
        return width * height;

    }

//    public void displayRectangleHeight() {
//        System.out.println("Rectangle Height is: " + this.height);
//
//    }

    @Override
    public void displayHeight() {
        System.out.println("Rectangle Height is: " + this.height);

    }

    @Override
    public void resize(int size) {
        this.height += size;
        this.width = this.width + size;

    }
}

