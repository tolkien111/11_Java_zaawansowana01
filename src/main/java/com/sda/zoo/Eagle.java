package com.sda.zoo;

public class Eagle extends Animal implements FlyBehavior {

    @Override
    public void eat (String something){
        System.out.println("Eagle is eating " + something);
    }

    @Override
    public void fly (double height) {
        System.out.println("Eagle flying at " + height);

    }

}
