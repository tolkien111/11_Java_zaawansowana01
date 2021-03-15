package com.sda.vehicle;

public class VehicleApp {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run(90);
        System.out.println("\t");

//        Car car01 = new Car();
//        car01.addPassengers();
//        car01.run(120);
//        System.out.println("\t");
//
//        Motocycle motocycle = new Motocycle();
//        System.out.println("\t");
//        System.out.println("Dostęp z zewnątrz " + motocycle.getWheels());
//        System.out.println("\t");
//
        vehicle = new Car();
        vehicle.run(100);
        System.out.println("\t");

        vehicle = new Motocycle();
        vehicle.run(180);
        System.out.println("\t");

        Motocycle motocycle = new Motocycle();
        runThisVehicle(motocycle);

    }
    public static void  runThisVehicle (Vehicle vehicle){
        vehicle.run(222);
    }



}
