package com.sda.wyjatki.zadania.zadanie1;

public class MathMethods {

    public static void devide(float firstNumber, float secondNumber) throws CannotDivideBy0Exception {
        if (secondNumber == 0){
            throw new CannotDivideBy0Exception();
        }
        float result = firstNumber / secondNumber;
        System.out.println("Result of devide " + firstNumber + " by " + secondNumber + " is: " + result);
    }
}

