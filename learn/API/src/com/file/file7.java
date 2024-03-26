package com.file;

import java.io.File;
import java.io.IOException;

public class file7 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("API\\aaa");//创建文件夹
        if (!file1.exists()){
            file1.mkdirs();
        }
        File file2 = new File(file1,"a.txt");
        boolean result = file2.createNewFile();//文件所在的文件夹必须存在
        System.out.println(result);

    }
}
