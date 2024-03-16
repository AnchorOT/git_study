package com.stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class stream8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("alice,22");
        list.add("tom,23");
        list.add("bell,26");
        Map<String, Integer> map = list.stream().filter(s -> {
            String[] split = s.split(",");
            int age = Integer.parseInt(split[1]);
            return age >= 24;
        }).collect(Collectors.toMap(
                s -> s.split(",")[0],
                s -> Integer.parseInt(s.split(",")[1])));
//                (String s) -> {
//                    return s.split(",")[0];
//                },
//                (String s) -> {
//                    return Integer.parseInt(s.split(",")[1]);
//                }
//        ));
        System.out.println(map);
    }
}
