package com.sda.opp.zadania.zadanie3;

public class Circle extends Shape {
    private float radius;

    public Circle() {
        setColor("unknown");
        setFilled(false);
        radius = 1;
    }

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        float area = radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%f witch is a subclass off %s", radius, super.toString());
    }
}
