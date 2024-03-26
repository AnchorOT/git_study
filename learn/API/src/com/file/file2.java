package com.file;

import java.io.File;

public class file2 {
    public static void main(String[] args) {
//        绝对路径
        File file1 = new File("C:\\Java\\workplace\\1.txt");

        File file2 = new File("1.txt");
//        当前项目下 - 指定模块下的
        File file3 = new File("learn\\1.txt");
    }
}
