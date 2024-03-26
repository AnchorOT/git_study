package com.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class charStream {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        编码
        String s = "你好";
        byte [] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] bytes1 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));
//        解码
        byte [ ] bytes2 = {-28, -67, -96, -27, -91, -67};
        byte [ ] bytes3 = {-60, -29, -70, -61};
        String s1 = new String(bytes2);
        String s2 = new String(bytes3,"gbk");
        System.out.println(s1);
        System.out.println(s2);


    }
}
