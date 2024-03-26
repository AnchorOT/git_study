package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class charStream6 {
    public static void main(String[] args)throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("a1.txt"));
        bw.write(97);
        char [] chars = {97,98,99,100,101,102};
        bw.write(chars);
//        BufferedWriter特有方法
        bw.newLine();
        bw.write("BufferedWriter特有方法 newline()");
        bw.close();
    }
}
