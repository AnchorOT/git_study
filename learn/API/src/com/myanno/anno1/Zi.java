package com.myanno.anno1;

public class Zi extends Fu{
    @Override
    public void show() {
        System.out.println("son");
    }
    @Deprecated
    public void method(){
        System.out.println("method");
    }
    @SuppressWarnings(value = "all")

    public void function() {

        int a = 10;
        int b = 20;
    }
}

