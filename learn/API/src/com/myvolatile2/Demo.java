package com.myvolatile2;

public class Demo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("girl");
        t1.start();
        MyThread2 t2 =new MyThread2();
        t2.setName("boy");
        t2.start();
    }
}
