package com.ThreadCountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyCountDownLatch {
    public static void main(String[] args) {
        CountDownLatch cd = new CountDownLatch(3);
        Mother mother = new Mother(cd);

        Child1 child1 = new Child1(cd);
        child1.setName(" tom ");
        Child2 child2 = new Child2(cd);
        child2.setName(" alice ");
        Child3 child3 = new Child3(cd);
        child3.setName(" lisa ");
        mother.start();
        child1.start();
        child2.start();
        child3.start();


    }
}
