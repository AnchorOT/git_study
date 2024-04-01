package com.myvolatile;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        while (Money.money==100000){
        }
        System.out.println("liar");

    }
}
