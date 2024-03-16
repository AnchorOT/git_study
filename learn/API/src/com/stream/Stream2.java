package com.stream;

import java.util.*;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
//        单列集合
        arraylist();
//        双列集合
        hashmap();
//        数组
        arrays();
//        同种数据类型的多个数据
        Stream.of(1,2,3,4,5,6,7,8,9).forEach(s-> System.out.println(s));

    }

    private static void arrays() {
        int [] arr = {1,2,3,4,5,6};
//      数组   Arrays.stream(数组名)
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }

    private static void hashmap() {
        HashMap<String,Integer> hashMap= new HashMap<>();
        hashMap.put("alice",18);
        hashMap.put("tom",21);
        hashMap.put("lisa",20);
        hashMap.put("anderson",23);
//      双列集合  集合对象，keySet().stream()
        Set<String> set = hashMap.keySet();
        set.stream().forEach(s-> System.out.println(s));

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        entries.stream().forEach(s-> System.out.println(s));
    }

    private static void arraylist() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//      单列集合 集合对象.stream() 直接获取
        list.stream().forEach(s-> System.out.println(s));
    }
}
