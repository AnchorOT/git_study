package com.io;

import java.io.*;
import java.util.Arrays;

public class charStream7 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("user.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("a1.txt"));//对同一文件操作时不可提前创建 否则会清空该文件
        String line = br.readLine();
        br.close();
        String[] split = line.split(" ");
        int [] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            String smallStr = split[i];
            int number = Integer.parseInt(smallStr);
            arr[i]= number;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
            bw.flush();
        }
        bw.close();
    }
}
