package com.therad.BlockingQueue2;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    private ArrayBlockingQueue<String> list;
    public Cook(ArrayBlockingQueue<String> list) {
        this.list=list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                list.put("hamburger");
                System.out.println("put");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
