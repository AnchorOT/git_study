package com.therad.thread6;

public class test {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread3 t2 = new MyThread3();
        t1.setName("girl");
        t2.setName("dog");
        t2.setDaemon(true);//把第二个线程设置为守护线程  不会执行完毕
        t1.start();
        t2.start();
    }
}
