package com.ThreadCountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Mother extends Thread {
    private CountDownLatch cd;

    public Mother(CountDownLatch cd) {
        this.cd = cd;
    }

    @Override
    public void run() {
        try {
            cd.await();
            System.out.println("                  clean");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
