package com.myvolatile2;

public class Money {
    public static volatile int money = 100000;// volatile 强制刷新线程获取数据
    public static Object lock = new Object();
}
