package com.file;

import java.io.File;
import java.util.HashMap;

public class file9 {
    public static void main(String[] args) {
        File file = new File("API");
        HashMap<String,Integer> hm = new HashMap<>();
        getCount(hm,file);
        System.out.println(hm);
    }

    private static void getCount(HashMap<String,Integer> hm,File file) {
        File []files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                String file1Name = file1.getName();
                String[] filenameArr = file1Name.split("\\.");
                if (filenameArr.length==2){
                    String fileEndName = filenameArr[1];
                    if (hm.containsKey(fileEndName)){
                        Integer i = hm.get(fileEndName);
                        i++;
                        hm.put(fileEndName,i);
                    }else{
                        hm.put(fileEndName,1);
                    }
                }
            }else{
                getCount(hm,file1);
            }
        }

    }
}
