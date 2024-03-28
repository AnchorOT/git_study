package com.therad.thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();//线程开启之后 执行call方法
        FutureTask<String> ft= new FutureTask<>(mc);//可以获取线程执行完毕的结果，也可以作为参数传递给Thread对象
        Thread t1 = new Thread(ft);
        t1.start();
        String s = ft.get();
        System.out.println(s);
    }
}
