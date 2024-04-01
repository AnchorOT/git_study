package com.therad.BlockingQueue2;

import java.util.concurrent.ArrayBlockingQueue;

public class demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> list = new ArrayBlockingQueue<>(1);

        Cook c = new Cook(list);
        Foodie f = new Foodie(list);
        c.start();
        f.start();
    }
}
