package com.sda.exPolimorfism;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3,5,24,67);
        System.out.println(movablePoint);
        MovableCircle movableCircle = new MovableCircle(movablePoint);
        System.out.println(movableCircle);
        movableCircle.moveUp();
        movableCircle.moveLeft();
        System.out.println(movableCircle);
    }
}
