package com.io;

import java.io.FileInputStream;
import java.io.IOException;

public class input {
    public static void main(String[] args) {
        FileInputStream fis  =null;
        try {
            fis= new FileInputStream("C:\\Java\\workplace\\1.txt");
//            一次读取一个字符
            int read = fis.read();
            System.out.println(read);
            System.out.println((char) read);

            int b ;
            while ((b = fis.read()) != -1){
                System.out.println((char) b);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fis != null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
