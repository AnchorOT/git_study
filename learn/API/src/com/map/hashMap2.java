package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("001","1alice");
        map.put("002","2tom");
        map.put("003","3jack");
        map.put("004","4jack");


        Set<String> keys = map.keySet();
        for (String key : keys) {
            String s = map.get(key);
            System.out.println(key +"  value  "+  s);
        }


        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"----"+value);
        }
    }
}
