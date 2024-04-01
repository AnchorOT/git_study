package com.ThreadPoor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
    public static void main(String[] args) throws InterruptedException {
//        新建一个默认的线程池对象，默认为空最多可以容纳int类型的最大值
        ExecutorService executorService = Executors.newCachedThreadPool();
//        Executors  可以帮助我们创建线程池对象
//        ExecutorService 可以帮我们控制线程池
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        Thread.sleep(2);
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });

        executorService.shutdown();


    }
}
