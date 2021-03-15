package com.sda.vehicle;


public class Car extends Vehicle {

    private int passengers;

    public Car() { //konstruktor bezargumentowy, wydrukuj w VehicleApp żeby zobaczyć jak są tworzone -> jeden po drugim -> Vehicle->Car
        System.out.println("Tworzenie car");
    }

    @Override //nadpisywanie metod przy dziedziczeniu
    public void run(double velocity) {
        System.out.println("Car with " + passengers + " passangers running at " + velocity);
    }

    public void addPassengers() {
        passengers += 1;
        System.out.println("Now we have " + passengers + " passengers");
    }

    public void removePassengers() {
        passengers -= 1;
        System.out.println("Now we have " + passengers + " passengers");
    }


}
