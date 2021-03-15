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

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                '}';
    }

    public void addPassengers() {
        if (passengers >= 4) {
            System.out.println("osiągnięto maksymalną liczbę pasażerów - 4 ");
        }else{
            passengers += 1;
        }
        System.out.println("Now we have " + passengers + " passengers");
    }

    public void removePassengers() {
        if (passengers <= 0) {
            System.out.println("błędna liczba pasażerów, liczba nie może być mniejsza niż zero");
        }else{
            passengers -= 1;

        }
        System.out.println("Now we have " + passengers + " passengers");
    }




}
