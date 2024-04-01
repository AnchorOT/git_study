package com.therad.thread7;

public class Foodie extends Thread {
    private Desk desk;
    public Foodie(Desk desk) {
        this.desk=desk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (desk.getLock()) {
                if (desk.getCount() == 0) {
                    break;
                } else {
                    if (desk.isFlag()) {// exist
                        System.out.println("eat");
                        desk.setFlag(false);
                        desk.getLock().notifyAll();
                        int i = desk.getCount() - 1;
                        desk.setCount(i);
                    } else {
                        // wait
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
