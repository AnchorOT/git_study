package com.file;

import java.io.File;

public class file5 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    private static void method3() {
        File file1 = new File("C:\\Java\\workplace\\aaa\\bbb\\ccc");
        File file2 = new File("C:\\Java\\workplace\\1.txt");
        String name = file1.getName();
        System.out.println(name);// 文件夹为文件夹名 文件是文件名加后缀
    }

    private static void method2() {
        File file = new File("C:\\Java\\workplace\\1.txt");
        boolean result = file.exists();//该路径下文件是否存在
        System.out.println(result);
    }

    private static void method1() {
        File file = new File("C:\\Java\\workplace\\1.txt");
        boolean result1 = file.isFile();//是否为文件
        boolean result2 = file.isDirectory();//是否为文件夹
        System.out.println(result1);
        System.out.println(result2);
    }
}
