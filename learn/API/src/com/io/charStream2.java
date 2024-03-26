package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class charStream2 {
    public static void main(String[] args) throws IOException {
//        创建输出流对象
//        FileWriter fw1 = new FileWriter(new File("a1.txt"));
        FileWriter fw2 = new FileWriter("a1.txt");
//        写出数据
        fw2.write(97);
        fw2.write(98);
        char[] chars = {97,98};
        fw2.write("\n\r");
        fw2.write(chars);
        fw2.write("\n\r");
        fw2.write(chars,1,1);
        fw2.write("\n\r");
        String s = "你好123aaa";
        fw2.write("\n\r");
        fw2.write("123");
        fw2.write("\n\r");
        fw2.write("123",0,2);
        fw2.write(s);
//        fw2.flush(); flush可续写 close不能
        fw2.write("666");
//        fw2.flush();

    }
}
