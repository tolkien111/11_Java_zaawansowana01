package com.sda.opp.zadania.zadanie1;

import java.lang.reflect.Array;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0f;
        this.y = 0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getYX() {
        float[] arrayTwoElemnts = {x, y};
        return arrayTwoElemnts;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
        float[] xyArray = {x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
