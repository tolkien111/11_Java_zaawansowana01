package com.sda.strings;

public class TextToUpperCase implements  StringOperation {

    @Override
    public String modify(String text) {
        return text.toUpperCase();
    }
}
