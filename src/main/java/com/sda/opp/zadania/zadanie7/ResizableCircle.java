package com.sda.opp.zadania.zadanie7;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize (int percent){
        setRadius(getRadius()* percent / 100);

    }
}
