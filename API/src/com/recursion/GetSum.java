package com.recursion;

public class GetSum {
    public static void main(String[] args) {
        int sum = getSum(100);
        int aa = 1;
//        -128-127
        System.out.println(sum);
    }

    private static int getSum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + getSum(i - 1);
        }
    }
}
