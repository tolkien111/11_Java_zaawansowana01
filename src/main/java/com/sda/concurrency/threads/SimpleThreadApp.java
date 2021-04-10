package com.sda.concurrency.threads;
//zadanie 1 ZAAW5

public class SimpleThreadApp {
    public static void main(String[] args) {
        SleepingRunnable sleepingRunnable = new SleepingRunnable("Anna", 1);
        Thread thread = new Thread(sleepingRunnable);
//        Thread thread = new Thread(new SleepingRunnable("Anna", 1)); // tworzę wątek
        Thread thread02 = new Thread(new SleepingRunnable("Adam",2));
        Thread thread03 = new Thread(new SleepingRunnable("John",3));

        thread.start(); //startujemy wątek
        thread02.start();
        thread03.start();
    }
}
