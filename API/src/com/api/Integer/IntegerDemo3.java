package com.api.Integer;

public class IntegerDemo3 {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArr = s.split(" ");
        int [] numberArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            int i1 = Integer.parseInt(strArr[i]);
            numberArr[i]= i1;
        }
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(numberArr[i]);
        }

    }
}
