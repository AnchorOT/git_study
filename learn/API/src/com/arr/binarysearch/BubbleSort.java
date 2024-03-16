package com.arr.binarysearch;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arrt= {3,5,2,1,4};
        BubbleSort(arrt);
        for (int i = 0; i < arrt.length; i++) {

            System.out.println(arrt[i]);
        }
    }

    public static void BubbleSort(int[] arr) {
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1-j; i++) {
                if(arr[i]> arr[i+1]){
                    int temp= arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]=temp;
                }
        }
        }
    }
}
