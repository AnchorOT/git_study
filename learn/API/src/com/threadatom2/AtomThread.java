package com.threadatom2;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomThread implements Runnable{
    AtomicInteger ac =new AtomicInteger();
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            int count = ac.incrementAndGet();
            System.out.println("give"+count);
        }
    }
}
