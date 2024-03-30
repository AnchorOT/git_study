package com.therad.deadlock;



public class Demo {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        new Thread(()->{
            while (true){
                synchronized (obj1){
                    synchronized (obj2){
                        System.out.println("小康同学在走路");
                    }
                }
            }
        }).start();
        new Thread(()->{
            while (true){
                synchronized (obj2){
                    synchronized (obj1){
                        System.out.println("小为同学在走路");
                    }
                }
            }
        }).start();
    }
}
