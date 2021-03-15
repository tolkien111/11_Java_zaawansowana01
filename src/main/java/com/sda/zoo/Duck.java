package com.sda.zoo;

public class Duck extends Animal implements FlyBehavior, RunBehavior {

    @Override
    public String toString() {
        return "Duck ";
    }

    @Override
    public void eat(String something) {
        System.out.println("Duck is eating " + something);
    }

    @Override
    public void fly(double height) {
        double actualHeight = Math.min(height, 100); //dwie metody na osiągnięcie rezultatu
        if (height > 100) {
            height = 100;
        }
        System.out.println("Duck fly at " + height);
        System.out.println("Duck fly at " + actualHeight);
    }

    @Override
    public void run(double speed) {
        if (speed >= 20) {
            System.out.println("Maksymalna prędkość kaczki to 20");
        } else if (speed < 0) {
            System.out.println("Prędkość kaczki nie może być mniejsza od zera");
        } else {
            System.out.println("Prędkość kaczki to " + speed);
        }
    }
}
