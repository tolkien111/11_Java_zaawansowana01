package com.sda.examples;
//Zadanie 9 ZAAW1/str.104
public class Greeter2 {

    public static void main(String[] args) {

        Greeter2 newObject = new Greeter2();

        newObject.greet();
        newObject.greet("Anna");
        newObject.greet("Hi", "Karol");

    }

    void greet() {
        System.out.println("Hello, World!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    void greet(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }
}
