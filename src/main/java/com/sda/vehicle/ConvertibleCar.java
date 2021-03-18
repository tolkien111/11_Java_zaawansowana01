package com.sda.vehicle;

public class ConvertibleCar extends Car {
    boolean roofStatus;

    public void openRoof(boolean roofStatus) {
        if (roofStatus) {
            System.out.println("Dach jest otwarty");
        } else {
            roofStatus = true;
            System.out.println("Otwieranie dachu...");
        }
    }

    public void closeRoof(boolean roofStatus) {
        if (roofStatus) {
            System.out.println("Dach jest zamknięty");
        } else {
            roofStatus = false;
            System.out.println("Zamykanie dachu...");
        }
    }

    public boolean isRoofStatus() {
        return roofStatus;
    }

    public void setRoofStatus(boolean roofStatus) {
        this.roofStatus = roofStatus;
    }
}
