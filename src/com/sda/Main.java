package com.sda;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(12, 32, "Ana", "Plastic");
        Rectangle rectangle1 = new Rectangle(2, 2, "Vasile,", "Fier");

        System.out.println(triangle1.getSize());
        System.out.println(rectangle1.getSize());

        triangle1.resize(132);
        System.out.println(triangle1.base + " " + triangle1.height);
        triangle1.upDateText("Mara");
        System.out.println(triangle1.text);

        rectangle1.resize(562);
        System.out.println(rectangle1.width);
    }
}
