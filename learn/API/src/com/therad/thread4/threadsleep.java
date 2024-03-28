package com.therad.thread4;
import java.io.IOException;

public class threadsleep {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("before");
//        Thread.sleep(3000);
//        System.out.println("after");

        MyRunnable mr= new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.start();
        t2.start();
    }
}
