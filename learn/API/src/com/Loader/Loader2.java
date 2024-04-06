package com.Loader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Loader2 {
    public static void main(String[] args) throws IOException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

//        用加载器加载一个指定的文件
//        参数 文件的路径
//        返回值：字节流
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");
        Properties prop = new Properties();
        prop.load(is);
        System.out.println(prop);
        is.close();
    }
}
