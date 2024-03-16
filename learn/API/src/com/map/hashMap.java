package com.map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
//        如果添加的键存在 会覆盖原来的值 把原来的值当成返回值进行返回
        map.put("001","alice");
        map.put("002","tom");
        map.put("003","jack");
//        replace(map);
//        remove(map);
//        clear(map);
//        existKey(map);
//        existValue(map);
//        isEmpty(map);
        int size = map.size();
        System.out.println(size);

        System.out.println(map);

    }

    private static void isEmpty(Map<String, String> map) {
        boolean empty = map.isEmpty();
        System.out.println(empty);
    }

    private static void existValue(Map<String, String> map) {
        boolean result1 = map.containsValue("alice");
        boolean result2 = map.containsValue("aaa");
        System.out.println(result1);
        System.out.println(result2);
    }

    private static void existKey(Map<String, String> map) {
        boolean result1 = map.containsKey("001");
        boolean result2 = map.containsKey("005");
        System.out.println(result1);
        System.out.println(result2);
    }

    private static void clear(Map<String, String> map) {
        map.clear();
    }

    private static void remove(Map<String, String> map) {
        String remove = map.remove("003");
        System.out.println(remove);
    }

    private static void replace(Map<String, String> map) {
        String jack = map.put("003", "aaa");
        System.out.println(jack);
    }
}
