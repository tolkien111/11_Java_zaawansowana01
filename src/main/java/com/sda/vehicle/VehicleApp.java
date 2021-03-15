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
//
        vehicle = new Car();
        vehicle.run(100);
        System.out.println();

        vehicle = new Motocycle();
        vehicle.run(180);
        System.out.println();

        Motocycle motocycle01 = new Motocycle();
        runThisVehicle(motocycle01);

        ConvertibleCar kabrio = new ConvertibleCar();
        kabrio.openRoof(false);
        kabrio.openRoof(true);

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
    public static void  runThisVehicle (Vehicle vehicle){
        vehicle.run(222);
    }





}
