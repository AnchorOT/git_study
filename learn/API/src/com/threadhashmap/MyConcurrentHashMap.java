package com.threadhashmap;

import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> chm =new ConcurrentHashMap<>();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 25; i++) {
                chm.put(i+"",i+"");
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 25; i < 51; i++) {
                chm.put(i+"",i+"");
            }
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        for (int i = 0; i < 51; i++) {
            System.out.println(chm.get(i+""));
        }
    }
}
