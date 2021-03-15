package com.sda.vehicle;

public class Motocycle extends Vehicle {

    public Motocycle() {
        super(2); // słowo super mówi nam jakiego konstruktowa możemy użyć,
                        // jeżeli nie napiszemy to użyje konstruktora bezparametrowego (który jest domyśli i z reguły go nie piszemy
                        //możemy też wywoływać metody na słowie super z Vehicle
        System.out.println("Tworzenie motocykla");
        System.out.println("Liczba kół " + getWheels());
    }

    public void run(double velocity){
        System.out.println("motocycle running at speed " + velocity);
    }
}
