package com.therad.synchronousThread;

public class test9 {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("win1");
        t2.setName("win2");

        t1.start();
        t2.start();
    }
}
