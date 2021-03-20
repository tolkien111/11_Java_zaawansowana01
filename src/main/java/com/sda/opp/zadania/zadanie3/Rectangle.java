package com.sda.opp.zadania.zadanie3;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        setColor("unknown");
        setFilled(false);
        length = 1;
        width = 1;
    }

    public Rectangle(String color, boolean isFilled, double lenght, double width) {
        super(color, isFilled);
        this.length = lenght;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double lenght) {
        this.length = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle width=%f and length=%f witch a subclass off %s", width, length, super.toString());
    }
}
