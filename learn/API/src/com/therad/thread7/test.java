package com.therad.thread7;

public class test {
    public static void main(String[] args) {
        Desk desk = new Desk();
        desk.setCount(10);
        Foodie f = new Foodie(desk);
        Cook c = new Cook(desk);
        f.start();
        c.start();
    }
}
