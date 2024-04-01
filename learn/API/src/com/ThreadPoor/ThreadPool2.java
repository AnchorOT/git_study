package com.ThreadPoor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);//参数是最大值不是初始值
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        executorService.shutdown();

    }
}
