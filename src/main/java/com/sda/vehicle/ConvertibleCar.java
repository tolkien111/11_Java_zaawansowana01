package com.sda.vehicle;

public class ConvertibleCar extends Car {
    private boolean roofStatusOpened; // boolean przyjmuje domyślnie false -> domyślnie dach jest zamknięty

    public void openRoof() {
        if (roofStatusOpened) {
            System.out.println("Dach jest otwarty");
        } else {
            System.out.println("Otwieranie dachu...");
        }
        roofStatusOpened = true;
    }


    public void closeRoof() {
        if (roofStatusOpened) {
            System.out.println("Zamykanie dachu...");
        } else {
            System.out.println("Dach jest zamknięty");
        }
        roofStatusOpened = false;
    }
}

