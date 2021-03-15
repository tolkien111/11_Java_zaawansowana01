package com.sda.zoo;

public class Robot implements RunBehavior {

    @Override
    public String toString() {
        return "Robot ";
    }

    @Override
    public void run (double speed){
        if (speed >= 60) {
            System.out.println("Maksymalna prędkość robota to 60");
        } else if (speed < 0) {
            System.out.println("Prędkość robota nie może być mniejsza od zera");
        }
        System.out.println("Prędkość robota to " + speed);
    }
}
