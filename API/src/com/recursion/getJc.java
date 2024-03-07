package com.recursion;

public class getJc {
    public static void main(String[] args) {
        double result = getJc(10);
        System.out.println(result);
        }
    public static double getJc(double i){
           if(i==1){
        return 1;
    }else{
               return i*getJc(i-1);
           }
}
}
