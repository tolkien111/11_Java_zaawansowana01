package com.sda.opp.zadania.zadanie3;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape() {
        color = "unknown";
        isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        String result;
        if (isFilled){
            result = "filled";
        }else{
            result = "not filled";
        }

        return String.format("Shape with color of %s and %s",
                getColor(), result);
    }
}
