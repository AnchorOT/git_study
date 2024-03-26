package com.io;

import java.io.*;
import java.nio.charset.Charset;

public class converted {
    public static void main(String[] args)throws IOException {
        //method1();
        //method2();
        FileReader fr = new FileReader("a1.txt", Charset.forName("utf-8"));//jdk11
        int ch ;
        while ((ch= fr.read())!=-1){
            System.out.println((char)ch);
        }
        fr.close();
    }

    private static void method2() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a1.txt"),"utf-8");//jdk8
        osw.write("大家好");
        osw.close();
    }

    private static void method1() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a1.txt"),"utf-8");
        int ch ;
        while ((ch= isr.read())!=-1){
            System.out.println((char)ch);
        }
        isr.close();
    }
}
