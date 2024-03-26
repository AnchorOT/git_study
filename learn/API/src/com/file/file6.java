package com.file;

import java.io.File;

public class file6 {
    public static void main(String[] args) {
        File file = new File("C:\\Java\\workplace");
        File[] files = file.listFiles();//进入文件夹，获取这个文件夹里的文件和文件夹的File对象，并把这些File对象都放在一个数组中返回，包括隐藏文件
        for (File path : files) {
            System.out.println(path);
        }
//        当调用一个文件时 返回null  空文件夹返回长度为0的一个数组 有文件时用数组返回 有权限文件夹返回null

    }
}
