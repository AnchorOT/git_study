package com.therad.thread3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("Callable"+i);
        }
        return "yes";//返回值就是线程运行结束后的结果
    }
}
