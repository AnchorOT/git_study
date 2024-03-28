package com.therad.thread1;

public class threadtest1 {
//    线程是有默认名字的；格式为Thread-编号
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        MyThread t1 = new MyThread("alice");
//        MyThread t2 = new MyThread();
//        t1.setName("alice");
//        t2.setName("tom");
//        t1.run();//表示的仅仅是创建对象，用对象去调用方法，并没有开启线程。
        t1.start();//开启第一条线程
//        t2.start();//开启第二条线程
    }
}