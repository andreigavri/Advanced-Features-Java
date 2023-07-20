package com.sda;

public abstract class Shape {
    String text;
    String material;


    public Shape() {
    }
    public Shape(String text, String material) {

        this.material = material;
        this.text = text;
    }

    public double getSize(){
      return -1;
    }

    public abstract void displayHeight();

    }




