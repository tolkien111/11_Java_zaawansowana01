package com.sda.klasyiinterfasy.zadania.zadanie3;

public class Car {
    private String nameCar;
    private String typeOfCar;
    private final Engine carEngine;

    public Car(String nameCar, String typeOfCar) {
        this.nameCar = nameCar;
        this.typeOfCar = typeOfCar;
        carEngine = new Engine();
        carEngine.setEngine(typeOfCar);
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", typeOfCar='" + typeOfCar + '\'' +
                ", carEngine=" + carEngine +
                '}';
    }

    class Engine {
        private String typeOfEngine;

        public void setEngine(String typeOfCar) {
            if (typeOfCar.equals("economy")) {
                this.typeOfEngine = "diesel";
            } else if (typeOfCar.equals("luxury")) {
                this.typeOfEngine = "electric";
            } else {
                this.typeOfEngine = "petrol";
            }
        }

        @Override
        public String toString() {
            return "{typeOfEngine='" + typeOfEngine + '\'' +
                    '}';
        }
    }
}
