package com.sda.vehicle;

public class VehicleApp {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run(90);
        System.out.println();

        Car car01 = new Car();
        car01.addPassengers();
        car01.run(120);
        System.out.println();

        Motocycle motocycle = new Motocycle();
        System.out.println();
        System.out.println("Dostęp z zewnątrz " + motocycle.getWheels());
        System.out.println();

        vehicle = new Car();
        vehicle.run(100);
        System.out.println();

        vehicle = new Motocycle();
        vehicle.run(180);
        System.out.println();

        Motocycle motocycle01 = new Motocycle();

        System.out.println("-----------------------------");

        ConvertibleCar kabrio = new ConvertibleCar();
        kabrio.setRoofStatusOpened(false);
        kabrio.openRoof();
        kabrio.setRoofStatusOpened(true);
        kabrio.openRoof();
        kabrio.setRoofStatusOpened(true);
        kabrio.closeRoof();
        kabrio.setRoofStatusOpened(false);
        kabrio.closeRoof();
        System.out.println("-----------------------------");

        car01.addPassengers();
        car01.addPassengers();
        car01.addPassengers();
        car01.addPassengers();

        car01.removePassengers();
        car01.removePassengers();
        car01.removePassengers();
        car01.removePassengers();
        car01.removePassengers();


    }

    public static void runThisVehicle(Vehicle vehicle) {
        vehicle.run(222);
    }


}
