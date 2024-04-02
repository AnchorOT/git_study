package com.ThreadSemaphore;

public class ThreadSemaphore {
    public static void main(String[] args) {
        runnable runnable=new runnable();
        for (int i = 0; i < 100; i++) {
            new Thread(runnable).start();
        }
    }
}
