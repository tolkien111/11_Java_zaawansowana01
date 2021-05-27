package com.sda.typygeneryczne.zadania.zadanie5;

import java.util.ArrayList;
import java.util.List;

public class AnimalHouseApp {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Egyptian cat", "meat"));
        animalList.add(new Dog("Pitbull", 5));

        AnimalHouse<Animal> animalHotel = new AnimalHouse<>(animalList);
        System.out.println(animalHotel.getAnimalHouse());
    }
}
