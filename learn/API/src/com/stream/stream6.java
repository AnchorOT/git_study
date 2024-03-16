package com.stream;

import java.util.ArrayList;

public class stream6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            list.add(i);
        }
//        list.stream().filter(
//                (Integer i)->{
//                    return i%2==0;
//                }
//        )
        list.stream().filter(number->number%2==0).forEach(number-> System.out.println(number));
        System.out.println("======================");
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
