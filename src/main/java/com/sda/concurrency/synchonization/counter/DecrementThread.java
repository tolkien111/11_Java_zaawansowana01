package com.sda.concurrency.synchonization.counter;

//Zadanie 2.1 ZAAW5
public class DecrementThread extends Thread {

    SimpleCounter counter;

    public DecrementThread(SimpleCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.decrement();
        }
    }
}

