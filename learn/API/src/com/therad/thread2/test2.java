package com.therad.thread2;

public class test2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        MyRunnable mr2 = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr2);
        t1.start();
        t2.start();
    }

}
