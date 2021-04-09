package com.sda.opp.zadania.zadanie6;

public class MovableApp {

    public static void main(String[] args) {

        Movable movablePoint = new MovablePoint(25,26,3,5);
        movablePoint.moveRight();
        movablePoint.moveDown();
        System.out.println(movablePoint);

        Movable movableCircle = new MovableCircle(44, 30,45, 5,6);
        movableCircle.moveUp();
        movableCircle.moveLeft();
        System.out.println(movableCircle);



    }
}
