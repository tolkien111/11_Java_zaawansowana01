package com.sda.wyjatki.zadania.Zadanie1;

public class MathMethods {

    public static void devide(float firstNumber, float secondNumber) throws cannotDivideBy0Exception {
        if (secondNumber == 0){
            throw new cannotDivideBy0Exception();
        }
        float result = firstNumber / secondNumber;
        System.out.println("Result of devide " + firstNumber + " by " + secondNumber + " is: " + result);
    }
}

