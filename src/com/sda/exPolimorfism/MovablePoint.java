package com.sda.exPolimorfism;

public class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    @Override
    public void moveUp() {
        this.y = this.y + this.ySpeed;

    }

    @Override
    public void moveDown() {
        this.y = this.y - this.ySpeed;

    }

    @Override
    public void moveLeft() {
        this.x = this.x + this.xSpeed;

    }

    @Override
    public void moveRigth() {
        this.x = this.x - this.xSpeed;

    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}