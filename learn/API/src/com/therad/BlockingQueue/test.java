package com.therad.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class test {
    public static void main(String[] args) throws InterruptedException {
//        创建阻塞队列的对象，容量为1
        ArrayBlockingQueue <String> arrayBlockingQueue =new ArrayBlockingQueue<>(1);
//        存储元素
        arrayBlockingQueue.put("hamburger");
//取元素
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
        System.out.println("done");
    }
}
