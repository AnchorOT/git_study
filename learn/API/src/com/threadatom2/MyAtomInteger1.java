package com.threadatom2;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomInteger1 {
    public static void main(String[] args) {
        AtomicInteger ac1 = new AtomicInteger();
        AtomicInteger ac2 = new AtomicInteger(10);
        AtomicInteger ac3 = new AtomicInteger(10);
        AtomicInteger ac4 = new AtomicInteger(10);
        AtomicInteger ac5 = new AtomicInteger(10);
        System.out.println(ac1.get());// get
        int andIncrement = ac2.getAndIncrement();// get then increase
        System.out.println(andIncrement);
        System.out.println(ac2.get());
        int i = ac3.incrementAndGet();// increase then get
        System.out.println(i);
        int i1 = ac4.addAndGet(10); //与对象的值相加 然后返回
        System.out.println(i1);
        System.out.println(ac4.get());
        int andSet = ac5.getAndSet(15);//以原子的方式设置为newValue的值，并返回旧值
        System.out.println(andSet);
        System.out.println(ac5.get());


    }
}
