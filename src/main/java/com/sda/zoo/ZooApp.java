package com.sda.zoo;

public class ZooApp {

    public static void main(String[] args) {

        Eagle eagle = new Eagle();
        eagle.fly(120);
        System.out.println();

        Duck duck = new Duck();
        duck.fly(80);
        System.out.println();

        Air air = new Air();
        air.flyInAir(eagle);
        air.flyInAir((duck));
        System.out.println();

        Animal anotherDuck = new Duck();
        anotherDuck.eat("vegetables");

        Animal anotherEagle = new Eagle();
        anotherEagle.eat("mouse");

        FlyBehavior plain = new FlyBehavior() { // implementujemy klasę anonimową (anonimowa czyli nie ma nazwy)
                                                // potrzebne gdy chcemy dodać konkretną funkcjonalność w programie
                                                // która będzie potrzebna tylko w tym miejscu
            @Override
            public void fly(double height) {
                if (height >= 3000) {
                    System.out.println("I fly high at " + height);
                } else {
                    height = 3000;
                    System.out.println("I fly high at " + height);
                }
            }
        }; // klasa anonimowa, java widzi ją to jak jedną linijką kodu, pokazuje jej to średnik na końcu
        plain.fly(4000);
    }
}
