package com.arr.binarysearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class QuiteSort {
    public static void main(String[] args) {
        int [] arr = {6,1,2,7,9,3,4,5,10,8};
        Integer [] arr1 = {6,1,2,7,9,3,4,5,10,8,11,3};
//        quiteSort(arr,0,arr.length-1);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
//        quiteSort(arr1,0,arr1.length-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        String s = Arrays.toString(arr1);
        System.out.println(s);
        System.out.println(Arrays.binarySearch(arr1, 1));

    }

//    private static void quiteSort(int[] arr, int left, int right) {
//        if(right < left){
//          return;
//        }
//        int left0=left;
//        int right0=right;
//        int baseNumber =arr [left0];
//        while(left!=right){
//
//            while (arr[right]>=baseNumber && right>left){
//                right--;
//            }
//            while (arr[left] <= baseNumber && right>left){
//                left++;
//            }
//            int temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//        }
//        int temp = arr[left];
//        arr[left]=arr[left0];
//        arr[left0]=temp;
//        quiteSort(arr,left0,left-1);
//        quiteSort(arr,left+1,right0);
//    }
}
