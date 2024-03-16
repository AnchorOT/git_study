package com.api.Integer;

public class IntegerDemo2 {
    public static void main(String[] args) {
        String s1 = "100";
        int i1 =100;
        System.out.println(s1+i1);
        int i2= Integer.parseInt(s1);
        System.out.println(i2+i1);
        // int to String
        int i3 = 100;
        String s2 = i3 + "";
        String s3 = String.valueOf(i3);
        //字符串与int类型转换
    }
}
