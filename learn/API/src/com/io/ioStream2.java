package com.io;

import java.io.*;

public class ioStream2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Anchor\\Videos\\2023-06-07 19-16-37.mkv"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Anchor\\Videos\\copy.mkv"));

        int len ;
        byte bytes [] = new byte[1024];
        while ((len= bis.read(bytes))!= -1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}