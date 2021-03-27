package com.sda.generic.road;

import com.sda.vehicle.Car;

public class RoadApp {
    public static void main(String[] args) {
        Road<Car> carRoad = new Road<>();
        carRoad.setItem(new Car());
        carRoad.runThisVehicle(100);

        Car car = carRoad.getItem();
        car.addPassengers();
    }
}

