package com.sda.exPolimorfism;

public class MovableCircle implements Movable {

    private MovablePoint movablePoint; //compunere


    public MovableCircle(MovablePoint movablePoint) {
        this.movablePoint = movablePoint;
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();

    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();

    }

    @Override
    public void moveRigth() {
        movablePoint.moveRigth();

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                '}';
    }
}
