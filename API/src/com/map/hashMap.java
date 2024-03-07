package com.map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("001","alice");
        map.put("002","tom");
        map.put("003","jack");
        System.out.println(map);

    }
}
