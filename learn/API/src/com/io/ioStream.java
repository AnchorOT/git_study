package com.io;

import java.io.*;

public class ioStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Anchor\\Videos\\2023-06-07 19-16-37.mkv"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Anchor\\Videos\\copy.mkv"));

        int b ;
        while ((b= bis.read())!= -1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
