package com.sda.concurrency.threads;
//zadanie 1 ZAAW5

import java.util.concurrent.TimeUnit;

public class SleepingRunnable implements Runnable {

    private final String name;
    private final int seconds;


    public SleepingRunnable(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    /*
Zmodyfikuj run tak, aby wątek 4 razy przesypiał "seconds" sekund i wyświetlał swoje imię.
tutaj pojawia się problem ponieważ możemy wybudzić nasz wątek, programiści java uznali że może rzucić błędem i uznali, że jest to Checked Exception
*/

    @Override
    public void run() { //nadpisuje metodę run z Runnable
        try{ // łapiemy całą metodę ponieważ po obudzeniu wątku nie chcemy żeby ponownie zasypiał
        for (int i = 0; i < 4; i++) {
 //           Thread.sleep(1000L * time);
            TimeUnit.SECONDS.sleep(seconds); //nowocześniejsze podejście do tematu przesypiania
            System.out.println("Wątek " + name + " #" + i);
        }
        }catch (InterruptedException interruptedException){
            System.out.println("Ktoś mnie obudził");
        }

    }



}
