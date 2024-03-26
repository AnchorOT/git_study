package com.file;

import java.io.File;

public class file8 {
    public static void main(String[] args) {
        File src = new File("C:\\Java\\workplace\\src");
        deleteDir(src);

    }

    private static void deleteDir(File src) {
//      删掉这个文件夹中的所有内容
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else{
                deleteDir(file);
            }
        }
//      最后删掉这个文件夹
        src.delete();
    }
}
