package com.therad.thread7;

public class Cook extends Thread {
    private Desk desk;
    public Cook(Desk desk) {
        this.desk=desk;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (desk.getLock()) {
                if (desk.getCount() == 0) {
                    break;
                } else {
                    if (!desk.isFlag()) {
                        //                    product
                        System.out.println("producing....");
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    } else {
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
