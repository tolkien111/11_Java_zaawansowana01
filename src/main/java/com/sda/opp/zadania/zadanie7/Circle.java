package com.sda.opp.zadania.zadanie7;

public class Circle implements GeometricObject{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public double getArea(){
        return Math.PI*Math.sqrt(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
