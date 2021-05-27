package com.sda.typygeneryczne.zadania.zadanie5;

import java.util.List;

public class AnimalHouse <T extends Animal>{
     List <T> animalHouse;

    public AnimalHouse(List<T> animalHouse) {
        this.animalHouse = animalHouse;
    }

    public List<T> getAnimalHouse() {
        return animalHouse;
    }

    public void setAnimalHouse(List<T> animalHouse) {
        this.animalHouse = animalHouse;
    }

    @Override
    public String toString() {
        return "AnimalHouse{" +
                "animalHouse=" + animalHouse +
                '}';
    }
}
