package com.io;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class properties {
    public static void main(String[] args) {
        Properties prop = new Properties();
//        增
        prop.put("alice","tom");
        prop.put("lisa","tom");
        prop.put("杨过","黄蓉");
        System.out.println(prop);
//        删
        prop.remove("alice");
        System.out.println(prop);
//        改
        prop.put("alice","lisa");
        System.out.println(prop);
//        查
//        Object value = prop.get("杨过");
//        System.out.println(value);
//        遍历
        Set<Object> keys= prop.keySet();
        for (Object key: keys) {
            Object value = prop.get(key);
            System.out.println(key+" = "+value);
        }
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+"="+value);
        }


    }
}
