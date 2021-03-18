package com.sda.zoo;

import java.math.RoundingMode;

public class ZooApp {

    public static void main(String[] args) {

        Eagle eagle = new Eagle();
        eagle.fly(120);
        eagle.run(4);
        eagle.run(7);
        eagle.run(-4);
        System.out.println();


        Duck duck = new Duck();
        duck.fly(80);
        duck.run(15);
        duck.run(-20);
        duck.run(32);
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


        RunBehavior duckRunBehavior = new Duck();
        duckRunBehavior.run(30);


        RunBehavior eagleRunBehavior = new Eagle();
        eagleRunBehavior.run(10);
        System.out.println("-------------------------------------");


        Ground ground = new Ground();
        ground.runOnGround(eagle, 10);
        ground.runOnGround(duck, 5);
        System.out.println("-------------------------------------");


        Dog dog = new Dog();
        dog.eat("mięso");
        ground.runOnGround(dog, 50);

        Robot robot = new Robot();
        ground.runOnGround(robot, 55);
        System.out.println("-------------------------------------");

        RunBehavior gepard = new RunBehavior() {

            @Override
            public String toString() {
                return "Gepard ";
            }

            @Override
            public String run(double speed) {

                String name = "gepard";
                if (speed < 300) {
                    speed = 300;
                    System.out.println(name + " run at speed " + speed);
                } else {
                    System.out.println(name + " run at speed " + speed);
                }
                return null;
            }
        };
        gepard.run(350);
        ground.runOnGround(gepard, 200);


    }


}
