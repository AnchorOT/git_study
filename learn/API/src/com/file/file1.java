package com.file;

import java.io.File;

public class file1 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();

    }

    private static void method3() {
        File file1 = new File("C:\\Java\\workplace");
        String path = "1.txt";
        File file = new File(file1,path);
        System.out.println(file);
    }

    private static void method2() {
        //      从父路径名字符串和子路径名字符串创建新的File实例
        String path1 ="C:\\Java\\workplace";
        String path2 ="1.txt";
        File file = new File(path1,path2);
        System.out.println(file);
    }

    private static void method1() {
//      通过给定的路径名字符串转换为抽象路径名来创建新的File实例
        String path = "C:\\Java\\workplace\\1.txt";
        File file = new File(path);
    }

}
