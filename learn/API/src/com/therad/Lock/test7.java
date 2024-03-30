package com.therad.Lock;

public class test7 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
        int priority1 = t1.getPriority();
        int priority2 = t2.getPriority();
        int priority3 = t3.getPriority();
        System.out.println(priority1);
        System.out.println(priority2);
        System.out.println(priority3);
    }
}
