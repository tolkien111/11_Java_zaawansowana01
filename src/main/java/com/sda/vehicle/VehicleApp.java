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

        kabrio.openRoof();
        kabrio.openRoof();
        kabrio.closeRoof();
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
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

//Zadanie 10 ZAAW1/str.106 cd.
        System.out.println("KONSTRUKTOR KOPIUJĄCY");
        Car mustang = new Car(car01);
        System.out.println("KONSTRUKTOR Z OKREŚLONĄ LICZBĄ PASAŻERÓW");
        Car db9 = new Car(4);
        System.out.println("KONSTRUKTOR Z PODANĄ PRĘDKOŚCIĄ");
        Car veyron = new Car(356.4);
    }
//koniec zadania 10

    public static void runThisVehicle(Vehicle vehicle) {
        vehicle.run(222);
    }


}
