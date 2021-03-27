package com.sda.generic.road;

import com.sda.vehicle.Vehicle;

public class Road<T extends Vehicle> {
    private T item;

    public Road() {
    }

    public Road(T item) {
        this.item = item;
    }

    public void runThisVehicle(double speed) { // nadpisujemy metodę run z klasy Vehicle
        item.run(speed);
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

