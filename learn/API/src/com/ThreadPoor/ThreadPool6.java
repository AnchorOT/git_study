package com.ThreadPoor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool6 {
    public static void main(String[] args) {
//        参数一：核心线程数量
//        参数二：最大线程数
//        参数三：空闲线程最大存活时间
//        参数四：时间单位
//        参数五：任务队列
//        参数六：创建线程工厂  按照默认的方式创建线程
//        参数七：任务的拒绝策略
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                1,
                2,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 0 ; i<5;i++) {
            int y = i;
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+"   "+y);
            });
        }
        pool.shutdown();

    }
}
