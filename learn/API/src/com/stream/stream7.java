package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class stream7 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            list.add(i);
        }
//        collect 收集数据 Collectors.toList().在底层创建一个list集合，并把所有的数据添加到list集合中，
        List<Integer> collect = list.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);
        Set<Integer> collect1 = list.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(collect1);

    }
}
