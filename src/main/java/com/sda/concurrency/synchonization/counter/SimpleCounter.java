package com.sda.concurrency.synchonization.counter;

import java.util.concurrent.atomic.AtomicInteger;

//Zadanie 2.1 ZAAW5 i 2.3
//wykomentowane inne podejście do tematu synchronizacji wątków - mniej optymalne
public class SimpleCounter {

    //private int value;

    private AtomicInteger value = new AtomicInteger();

//    }synchronized public void decrement(){ //aby stracić synchronizację trzeba usunąć słowo synchronized -
//        value++;
//    }

    void increment() {
        value.incrementAndGet();
    }

//    }synchronized public void decrement(){ //aby stracić synchronizację trzeba usunąć słowo synchronized
//        value--;
//    }

    void decrement(){
        value.decrementAndGet();
    }

//    public int getValue() {
//        return value;
//    }

    public int getValue() {
        return value.get();

    }


    @Override
    public String toString() {
        return "SimpleCounter{" +
                "value=" + value +
                '}';
    }
}
