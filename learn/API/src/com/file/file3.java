package com.file;

import java.io.File;
import java.io.IOException;

public class file3 {
    public static void main(String[] args) throws IOException {
//        method1();
//        method2();
        method3();


    }

    private static void method3() {
        File file = new File("C:\\Java\\workplace\\aaa\\bbb\\ccc");
//        mkdirs 可以创建单级和多级文件夹
        boolean result = file.mkdirs();
        System.out.println(result);
    }

    private static void method2() {
        File file = new File("C:\\Java\\workplace\\aaa");
//        mkdir只能创建单级文件夹 且只能创建单级文件夹
        boolean result = file.mkdir();
        System.out.println(result);
    }

    private static void method1() throws IOException {
        //        createNewFile只能创建文件
        File file1 = new File("C:\\Java\\workplace\\2.txt");
        boolean result1 = file1.createNewFile();
        System.out.println(result1);
    }
}
