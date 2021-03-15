package com.sda.examples;
//Przeciążanie metod - method overloading

public class Greeter {

    public static void main(String[] args) {
        Greeter objectgreeter = new Greeter();

        objectgreeter.greet();
        objectgreeter.greet("Anna"); // wywoływanie metody która nie jest statyczna
        Greeter.greet("Hi", "Karol"); //wywoływanie metody statycznej
    }

    void greet(){
//      System.out.println("Hello, World!");
        greet("World"); //wywoływanie metod przeciążonych, nie soutujemy wszystkiego tylko posiłkujemy się
                              //najbardziej rozbudowaną metodą to wyświetlenia innych
//        System.out.println();
    }
    void greet(String name){
//      System.out.println("Hello, " + name + "!");
        greet("Hello", name );
//        System.out.println();
    }
    static void greet(String greeting, String name){
        System.out.println(greeting + ", " + name +"!");
//        System.out.println();
    }

}
