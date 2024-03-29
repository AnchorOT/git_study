package com.therad.TicketThread;

public class Ticket implements Runnable{
    private int ticket= 100;
    private Object object=new Object();

    @Override
    public void run() {
        while (true){
            synchronized (object){//多个线程必须使用同一把锁
                if (ticket<=0){
                    break;
                }else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"在卖票，还剩下"+ticket+"张票");
                }
            }
        }
    }
}
