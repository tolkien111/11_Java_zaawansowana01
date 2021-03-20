package com.sda.opp.zadania.zadanie3;

public class FigureApp {

    public static void main(String[] args) {


//        Shape shape = new Shape("yellow", true);
//        System.out.println(shape);

        Circle circle = new Circle("red", false, 12);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle("black", false, 7f,15f);
        System.out.println(rectangle);
        System.out.println(rectangle1);

        Square square = new Square("green", true, 13);
        System.out.println(square);

    }
}
