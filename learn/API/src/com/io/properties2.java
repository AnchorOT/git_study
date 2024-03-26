package com.io;

import java.util.Properties;
import java.util.Set;

public class properties2 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("江苏","南京");
        prop.setProperty("安徽","南京");
        prop.setProperty("山东","济南");
//        底层调用hashtable方法
        System.out.println(prop);
        String value = prop.getProperty("江苏");
        System.out.println(value);
        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            String value1 = prop.getProperty(key);
            System.out.println(key+"="+value1);
        }
    }
}
