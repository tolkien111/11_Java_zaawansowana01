package com.sda.opp.zadania.zadanie7;

public class CircleApp {
    public static void main(String[] args) {

        Circle circle = new Circle(25);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter() + "\n");


        ResizableCircle resizableCircle = new ResizableCircle(25);

        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
        System.out.println(resizableCircle.getRadius() + "\n");

        resizableCircle.resize(70);

        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
        System.out.println(resizableCircle.getRadius());




        
    }

}
