package com.ThreadCountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Child2 extends Thread {
    private CountDownLatch cd;

    public Child2(CountDownLatch cd) {
        this.cd = cd;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(getName() + " eat " + i);
        }
        cd.countDown();
    }
}

