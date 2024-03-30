package com.therad.TicketThread2;

public class Thread extends java.lang.Thread {
    private static int ticketCount = 100;
    private static Object object=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (object){
                if (ticketCount<=0){
                    break;
                }else {
                    try {
                        java.lang.Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticketCount--;
                    System.out.println(java.lang.Thread.currentThread().getName()+"在卖票，还剩下"+ticketCount+"张票");
                }
            }
        }
    }
}
