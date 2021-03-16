package com.sda.zoo;

public class Robot implements RunBehavior {

    @Override
    public String toString() {
        return "Robot ";
    }

    @Override
    public String run (double speed){
        if (speed >= 60) {
            speed = 60;
            System.out.println("Maksymalna prędkość robota to " + speed);
        } else if (speed < 0) {
            speed = 0;
            System.out.println("Prędkość robota nie może być mniejsza od " + speed);
        }
        System.out.println("Prędkość robota to " + speed);
        return null;
    }
}
