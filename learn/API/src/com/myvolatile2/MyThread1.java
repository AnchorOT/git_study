package com.myvolatile2;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Money.lock){
                if (Money.money!=10000){
                    System.out.println("liar");
                    break;
                }
            }
        }
    }
}
