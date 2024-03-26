package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class output2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try{
//            System.out.println(2/0);
            fos = new FileOutputStream(new File("C:\\Java\\workplace\\1.txt"),true);
            fos.write(97);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                   e.printStackTrace();
                }
            }
        }

    }
}
