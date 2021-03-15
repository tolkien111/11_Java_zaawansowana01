package com.sda.zoo;

public class Dog extends Animal implements RunBehavior{

    @Override
    public String toString() {
        return "Dog ";
    }

    @Override
    public void eat(String something){
        System.out.println("Pies je " + something);
    }
    @Override
    public void run (double speed){
        if (speed >= 40) {
            System.out.println("Maksymalna prędkość psa to 40");
        } else if (speed < 0) {
            System.out.println("Prędkość psa nie może być mniejsza od zera");
        }
            System.out.println("Prędkość psa to " + speed);
        }
}





