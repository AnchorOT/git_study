package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class inputoutput {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:\\Users\\Fan Kaiwen\\Pictures\\1.png");
            fos = new FileOutputStream("API\\1.png");
            byte [] bytes = new byte[1024];
            int len;//读到的有效字符个数
            while ((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }

//            int b ;
//            while ((b=fis.read())!=-1){
//                fos.write(b);
//            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fis!= null){
                    try {
                        fis.close();
                        fos.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }

        }

    }
}
