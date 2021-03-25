package com.sda.typ.wyliczeniowy.zadania.zadanie3;

public enum TemperatureConvert {
    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempValue) {
            return (9 * tempValue / 5 + 32);
        }
    }),
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempValue) {
            return tempValue + 273.15f;
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempValue) {
            return tempValue - 273.15f;
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempValue) {
            return (5 * (tempValue - 32) / 9);
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempValue) {
            return 5 * (tempValue - 32) / 9 + 273.15f; // F = (5*(tempIn - 32)/9) + 273.15f
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempValue) {
            return 9 * (tempValue - 273.15f) / 5 + 32; //błąd w odpowiedziach od SDA -> odp. SDA "9 * (tempIn + 273.15f) / 5 + 32"
        }
    });


    private char tempIn;
    private char tempOut;
    private Converter converter;


    TemperatureConvert(char tempIn, char tempOut, Converter converter) {
        this.tempIn = tempIn;
        this.tempOut = tempOut;
        this.converter = converter;
    }

    public static float convertTemperatur(char tempIn, char tempOut, float tempValue) {   // próba z metodą statyczną
        for (TemperatureConvert temperatureConvert : values()) {
            if (temperatureConvert.tempIn == tempIn && temperatureConvert.tempOut == tempOut) {
                return temperatureConvert.converter.convert(tempValue);
            }
        }
        return 0f;
    }

//    public float convertTemperatur(char tempIn, char tempOut, float tempValue) {        // próba z metodą niestatyczną, wg mnie lepsze rozwiązanie :)
//        return converter.convert(tempValue);
//            }
}



