package com.ThreadSemaphore;

import java.util.concurrent.Semaphore;

public class runnable implements Runnable{
    Semaphore semaphore =new Semaphore(2);
    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("pass");
            Thread.sleep(20);
            System.out.println("release");
            semaphore.release();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
