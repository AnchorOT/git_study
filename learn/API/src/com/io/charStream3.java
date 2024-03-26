package com.io;

import java.io.FileReader;
import java.io.IOException;

public class charStream3 {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("a1.txt");
//        一次读取一个字符
       /* int ch;
        while ((ch= fr.read())!=-1){
            System.out.println((char) ch);
            fr.close();*//*
        }*/
//        一次读取多个对象
        char [] chars =new char[1024];
        int len;
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
    }
}
