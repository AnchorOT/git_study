package com.therad.BlockingQueue2;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    private ArrayBlockingQueue<String> list;
    public Foodie(ArrayBlockingQueue<String> list) {
        this.list=list;
    }

    @Override
    public void run() {
        String take = null;
        while (true) {
            try {
                take = list.take();
                System.out.println("eater"+take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
