package com.file;

import java.io.File;

public class file4 {
    public static void main(String[] args) {
//        method1();
//        只能删除文件和空文件夹
        File file = new File("C:\\Java\\workplace\\aaa\\bbb\\ccc");
        boolean result = file.delete();
        System.out.println(result);

    }

    private static void method1() {
        File file = new File("C:\\Java\\workplace\\2.txt");
        boolean result = file.delete();
        System.out.println(result);
    }
}
