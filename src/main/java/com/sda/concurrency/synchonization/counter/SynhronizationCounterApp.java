package com.sda.concurrency.synchonization.counter;
//Zadanie 2.1 ZAAW5
public class SynhronizationCounterApp {
    public static void main(String[] args) {
//Wspólny counter na którym będą pracować wątki

        SimpleCounter simpleCounter = new SimpleCounter();
//wątki zwiększające/zmniejszające
        IncrementThread incrementThread = new IncrementThread(simpleCounter);
        DecrementThread decrementThread = new DecrementThread(simpleCounter);
//Start pracy
        incrementThread.start();
        decrementThread.start();
//Zaczekaj aż wątki skończą pracę
        try {
            incrementThread.join(); //Zaczekaj aż ten skończy
            decrementThread.join(); // I zaczekaj aż ten skończy
        } catch (InterruptedException interruptedException) {
            System.out.println("Przerwane czekanie");
        }
//Wątki skończyły pracę -> wyświetl wątki
        System.out.println("Kierownik: wynik operacji " + simpleCounter);

    }
}
