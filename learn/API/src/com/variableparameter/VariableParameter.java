package com.variableparameter;
//求M个数的和
public class VariableParameter {
    public static void main(String[] args) {
        System.out.println(getSum(1,2,3,4,5,6,7));
    }
//    可变参数需要放在后面 如：public static int getSum(int a,int...arr){
    public static int getSum(int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
}
