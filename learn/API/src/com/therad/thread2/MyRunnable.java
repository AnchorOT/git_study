package com.therad.thread2;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"第二种方式实现多线程"+i);
        }
    }
}
