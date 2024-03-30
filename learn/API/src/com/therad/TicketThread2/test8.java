package com.therad.TicketThread2;

public class test8 {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.setName("win1");
        t2.setName("win2");
        t1.start();
        t2.start();
    }
}
