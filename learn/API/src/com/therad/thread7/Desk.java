package com.therad.thread7;

public class Desk {
    //    定义一个标记
//    true 表示桌子上有汉堡 ，此时吃货执行
//    false 表示桌子上没有汉堡 ，此时 厨师执行
    private boolean flag = false;
    private int count;
    //    lock
//    public static final Object lock = new Object();
private final  Object lock = new Object();

    public Desk() {
    }

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "flag=" + flag +
                ", count=" + count +
                ", lock=" + lock +
                '}';
    }
}
