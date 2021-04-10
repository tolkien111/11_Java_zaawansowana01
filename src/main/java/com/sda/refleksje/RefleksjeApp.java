package com.sda.refleksje;

import com.sda.vehicle.Car;

import java.lang.reflect.Method;

public class RefleksjeApp {
    public static void main(String[] args) throws Exception {// przyjeliśm ogólnie Exception, getDeclareMethod i invoke rzucają błędami

        Class<Car> klasaCar = Car.class;
        Method[] methods = klasaCar.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }


        Car car = new Car();
        Method methodRun = klasaCar.getDeclaredMethod("run", double.class); //szukamy metody run i podjemy typ danych przeyjmuje metoda
        methodRun.invoke(car, 100d);
    }
}
