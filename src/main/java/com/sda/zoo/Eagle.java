package com.sda.zoo;

public class Eagle extends Animal implements FlyBehavior, RunBehavior {

    @Override
    public String toString() {
        return "Eagle ";
    }

    @Override
    public void eat(String something) {
        System.out.println("Eagle is eating " + something);
    }

    @Override
    public void fly(double height) {
        System.out.println("Eagle flying at " + height);

    }

    @Override
    public String run(double speed) {
        if (speed >= 5) {
            speed = 5;
            System.out.println("Maksymalna prędkość orła to " + speed);
        } else if (speed < 0) {
            speed = 0;
            System.out.println("Prędkość orła nie może być mniejsza od " + speed);
        } else {
            System.out.println("Prędkość orła to " + speed);
        }
        return null;


    }

}
