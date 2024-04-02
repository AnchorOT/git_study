package com.ThreadCountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Child1 extends Thread {
    private CountDownLatch cd;

    public Child1(CountDownLatch cd) {
        this.cd = cd;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " eat " + i);
        }
        cd.countDown();
    }
}
