package com.exception;



public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr = null;
        try {
//          有肯定能发现的异常代码
            printarr(arr);
        } catch (NullPointerException e) {
//          如果出现异常，则这样处理
            System.out.println("参数不能为null");
        }
    }

    private static void printarr(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        }else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
