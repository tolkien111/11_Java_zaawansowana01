package com.sda.typ.wyliczeniowy.zadania.zadanie3;

public class TemperaturConverterApp {
    public static void main(String[] args) {
        float kelvinToFahrenheit = TemperatureConvert.convertTemperatur('K','F', 55f);
        System.out.println(kelvinToFahrenheit);

        float celciusToFahrenheit = TemperatureConvert.convertTemperatur('C','F', 13f);
        System.out.println(celciusToFahrenheit);

//        System.out.println(TemperatureConvert.C_F.convertTemperatur('C','F', 55f)); // niestatyczna metoda
//        System.out.println(TemperatureConvert.C_K.convertTemperatur('C','K', 44f));

    }
}
