package com.sda.zoo;

//Cwiczenie 6.1/str78

public abstract class Animal {
    boolean eatsMeat;

    abstract void eat(String something);

    boolean doYouEatMeat(){
        return eatsMeat;
    }
}
