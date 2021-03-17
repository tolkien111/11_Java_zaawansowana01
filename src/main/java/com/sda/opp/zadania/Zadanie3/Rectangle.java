package com.sda.opp.zadania.Zadanie3;

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

    public double getArea (double lenght, double width){
        double area = lenght * width;
        return area;
    }
    public double getPerimeter (double lenght, double width){
        double perimeter = (2 * lenght) + (2 * width);
        return perimeter;
    }

    @Override
    public String toString() {
        return String.format("Rectangle width=%f and length=%f witch a subclass off %s", width, length, super.toString());
    }
}
