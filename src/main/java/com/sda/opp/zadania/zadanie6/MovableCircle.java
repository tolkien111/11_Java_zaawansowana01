package com.sda.opp.zadania.zadanie6;

public class MovableCircle implements Movable {

    private MovablePoint movablePoint;
    private double circleRadius;

    public MovableCircle(double circleRadius, int x, int y, int xSpeed, int ySpeed) {
        this.circleRadius = circleRadius;
        this.movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
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
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                ", circleRadius=" + circleRadius +
                '}';
    }
}
