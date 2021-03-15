package com.sda.zoo;

public class Duck extends Animal implements FlyBehavior {

    @Override
    public void eat (String something){
        System.out.println("Duck is eating " + something);
    }

    @Override
    public void fly (double height){
        double actualHeight = Math.min(height, 100); //dwie metody na osiągnięcie rezultatu
        if (height > 100){
            height = 100;
        }
        System.out.println("Duck fly at " + height);
        System.out.println("Duck fly at " + actualHeight);
    }
}
