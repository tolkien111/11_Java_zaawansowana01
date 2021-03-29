package com.sda.generic.road;

import com.sda.vehicle.Car;
import com.sda.vehicle.Motocycle;

public class RoadApp {
    public static void main(String[] args) {
        Road<Car> carRoad = new Road<>();
        carRoad.setItem(new Car());
        carRoad.runThisVehicle(100);

        Car car = carRoad.getItem();
        car.addPassengers();

        Road<Motocycle> motocycle = new Road<>(new Motocycle());
        motocycle.getItem();
        motocycle.runThisVehicle(234);

        //Błąd poniżej! Nie możesz dać surowej klasy.
//        Road road = new Road();
//        road.runThisVehicle(123);





//        Road<String> stringRoad = new Road<>();
//        stringRoad.setT("Marszłkowska");
//        String street = stringRoad.getT();
//        System.out.println(street);
//
//        Road<Integer> integerRoad = new Road<>();
//        integerRoad.setT(1234);
//        int number = integerRoad.getT();
//        System.out.println(integerRoad.getT());
//
//        Road<Boolean> booleanRoad = new Road<>();
//        booleanRoad.setT(true);
//        boolean isCorrect = booleanRoad.getT();
//        System.out.println(isCorrect);
//
//        // ŻLE!uŻYCIE SUROWEGO TYPU ROAD, RZUTOWANIE
//        Road rawRoad = new Road();
//        rawRoad.setT("Marszałkowska");
//        rawRoad.setT(1234);
//
//        Object rawRoadItem = rawRoad.getT();
//        //Wywali się w runtime, nie jest sprawdzane przy kompilacji
//        Integer integer = (Integer) rawRoadItem;
//

    }
}

