package com.threadatom;

public class AtomThread implements Runnable{
    private int count =0;
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count++;
            System.out.println("give"+count);
        }
    }
}
