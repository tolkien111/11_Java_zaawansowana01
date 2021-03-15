package com.sda.zoo;

public class Ground {


    void runOnGround(RunBehavior runBehavior, double speed) {
        System.out.println("Obiekt " + runBehavior.toString() + "biega po ziemi");
        runBehavior.run(speed);

    }
}
