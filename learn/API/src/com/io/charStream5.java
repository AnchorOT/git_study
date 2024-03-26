package com.io;

import java.io.*;

public class charStream5 {
    public static void main(String[] args)throws IOException {
//        字符缓冲流输入
        BufferedReader br = new BufferedReader(new FileReader("user.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("a1.txt"));
//        BufferedReader新方法 readLine() 读取一整行 读到换行符停止
//        String line1 = br.readLine();
//        String line2 = br.readLine();
//        String line3 = br.readLine();
//        System.out.println(line1);
//        System.out.println(line2);
//        System.out.println(line3);
//        循环读取
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
      /*  char [] chars = new char[1024];
        int len;
        while ((len=br.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }*/
        br.close();
    }
}
