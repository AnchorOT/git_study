package com.xut.exp;
import java.util.Arrays;
import java.util.Scanner;

public class paixu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] str = nums.split(" ");
        int[] arr=new int[str.length];
        for (int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
         }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length-1;j++){
                if(arr[j+1]<arr[j]){
                    int m= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=m;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}