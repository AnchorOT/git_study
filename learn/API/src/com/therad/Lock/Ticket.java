package com.therad.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();
    private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
//            synchronized (object){//多个线程必须使用同一把锁
                if (ticket <= 0) {
                    break;
                } else {
                    Thread.sleep(10);
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "在卖票，还剩下" + ticket + "张票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
//            }
        }
    }
}
