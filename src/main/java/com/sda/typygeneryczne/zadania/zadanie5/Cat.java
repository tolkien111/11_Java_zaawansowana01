package com.sda.typygeneryczne.zadania.zadanie5;

public class Cat extends Animal {
    private String food;

    public Cat(String name, String food) {
        super(name);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
