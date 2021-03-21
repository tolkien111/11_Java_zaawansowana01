package com.sda.vehicle;

public class ConvertibleCar extends Car {
    private boolean roofStatusOpened;

    public void openRoof() {
        if (roofStatusOpened) {
            System.out.println("Dach jest otwarty");
        } else {
            System.out.println("Otwieranie dachu...");
        }
    }


    public void closeRoof() {
        if (roofStatusOpened) {
            System.out.println("Zamykanie dachu...");
        } else {
            System.out.println("Dach jest zamknięty");
        }
    }
    public void setRoofStatusOpened(boolean roofStatusOpened) {
        this.roofStatusOpened = roofStatusOpened;
    }
}
