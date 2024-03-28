package com.therad.thread5;


import java.util.concurrent.FutureTask;

public class PriorityTest {
    public static void main(String[] args) {
        MyCallable mc = new MyCallable();
        FutureTask<String> ft =new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.setName("plane");
        t1.setPriority(1);
        System.out.println(t1.getPriority());
        t1.start();
        MyCallable mc2 = new MyCallable();
        FutureTask<String> ft2 =new FutureTask<>(mc2);
        Thread t2 = new Thread(ft2);
        t2.setName("tank");
        System.out.println(t2.getPriority());
        t1.setPriority(10);
        t2.start();
    }
}
