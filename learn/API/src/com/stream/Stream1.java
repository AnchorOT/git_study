package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
//        集合的批量添加
        ArrayList<String> list = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻"));
        ArrayList<String> list2 = new ArrayList<>();
        //        遍历list1 将以张开头的添加到list2
        for (String s : list) {
            if (s.startsWith("张")) {
                list2.add(s);
            }
        }
//        遍历list2 将长度为三的添加到list3
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length() == 3) {
                list3.add(s);
            }
        }
        for (String s : list3) {
            System.out.println(s);
        }
        System.out.println("\r");
        list.stream().filter(s->s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s-> System.out.println(s));
    }
}
