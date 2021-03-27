package com.sda.generic.box;

public class Box <T> { //ostre nawiasy symbolizują klasę generyczną
    T item;

    T get(){
        return item;
    }
    public  void set (T item){
        this.item = item;
    }
}
